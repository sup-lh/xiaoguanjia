package com.controller;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.domain.single;
import com.domain.singleExample;
import com.mapper.singleMapper;
import com.util.FileReaderUtils;
import com.util.UploadGiteeImgBed;
import com.util.ZipUtils;
import com.util.getopenid;
import org.apache.tomcat.util.http.fileupload.FileItem;
import org.apache.tomcat.util.http.fileupload.FileItemFactory;
import org.apache.tomcat.util.http.fileupload.disk.DiskFileItemFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

/**
 * 文件上传控制类
 *
 * @author swinglife
 */
@Controller
public class FileUploadController {

    /**
     * 下载 用@RequestParam注解来指定表单上的file为MultipartFile
     */
    @RequestMapping("/fileDownloadPath")
    public @ResponseBody List<String> getpath(String path) {

        List<String> filepathlist = new ArrayList();
        File file = new File("C:/Users/Administrator/Desktop/ppp/"+path);
        File[] tempList = file.listFiles();

        for (int i = 0; i < tempList.length; i++) {
            if (tempList[i].isFile()) {
                System.out.println("文     件：" + tempList[i]);
                filepathlist.add(tempList[i].toString());
            }
            if (tempList[i].isDirectory()) {
                System.out.println("文件夹：" + tempList[i]);
            }
        }
        return filepathlist;


    }

    /**
     * 上传文件前由于拿openid会报错 得单独拿openid
     */
    @RequestMapping("/openopen")
    public String opop(String code){
        String gain_openid = new getopenid().openid(code);
        return gain_openid;
    }

    /**
     * 上传文件前由于拿openid会报错 得单独拿openid
     */
    @RequestMapping("/delete")
    public String delete(String filepath){
        try {
            System.out.println("删除文件的路径: "+filepath);
            FileUtils.deleteDirectory(new File(filepath));
            return "删除成功";
        }catch (Exception e){
            return "删除失败";
        }
    }



    @Resource
    private singleMapper singleMapper;

    /**
     * 上传文件 用@RequestParam注解来指定表单上的file为MultipartFile
     */
    @RequestMapping("/fileUpload")
    @ResponseBody
    public int fileUpload(String timestamp,@RequestParam("files") MultipartFile files,HttpServletRequest request) throws IOException {
//        String deletePath = ""; // 返回删除文件的路径,上传成功后删除源文件

        int i = 0;

        // 制作path
        String path = timestamp;

        //获取年份，月份，天
        Calendar date = Calendar.getInstance();
        String year = String.valueOf(date.get(Calendar.YEAR));
        String month = String.valueOf(date.get(Calendar.MONTH)+1);
        String day = String.valueOf(date.get(Calendar.DAY_OF_MONTH));

        // 判断文件是否为空
        if (!files.isEmpty()) {
            String filesname = "/springfiles/"+year+"/"+month+"/"+day+"/"+path;
//            String filesname = "C:/Users/Administrator/Desktop/ppp/"+year+"/"+month+"/"+day+"/"+path;

            String fileDownloadUri="";
            try {
                // 文件保存路径
                File file=new File(filesname);

                if(!file.exists()){//如果文件夹不存在
                    file.mkdirs();//创建文件夹
                }

                String filePath = filesname+"/"
                        + files.getOriginalFilename();

                // 转存文件
                files.transferTo(new File(filePath));

                String targetURL = UploadGiteeImgBed.createUploadFileUrl(filePath);


                File file2 = new File(filePath);
                byte[] bytes = FileReaderUtils.readByNIO(file2);

                //请求体封装
                Map<String, Object> uploadBodyMap = UploadGiteeImgBed.getUploadBodyMap(bytes);
                //借助HttpUtil工具类发送POST请求
                String JSONResult = HttpUtil.post(targetURL, uploadBodyMap);
                //解析响应JSON字符串
                JSONObject jsonObj = JSONUtil.parseObj(JSONResult);
                //请求失败
                if(jsonObj == null || jsonObj.getObj("commit") == null){
                    System.out.println("请求失败");
                }
                //请求成功：返回下载地址
                JSONObject content = JSONUtil.parseObj(jsonObj.getObj("content"));
                String download_url = (String)content.getObj("download_url");
                System.out.println(download_url);

                singleExample singleExample = new singleExample();
                singleExample.createCriteria().andTimestampEqualTo(timestamp);
                single single = new single();
                single.setPic(download_url);
                i = singleMapper.updateByExampleSelective(single, singleExample);
                System.out.println("成功插入"+i+"条照片");

                // 将文件夹压缩成zip包
//
//                String zipFilePath = file+".zip";   //zip包路径
//                System.out.println("zip包路径"+zipFilePath);

//                try {
//                    FileOutputStream fos1 = new FileOutputStream(zipFilePath);
//                    ZipUtils.toZip(file, fos1,true);
//
//                    // 压缩成功后,定义文件夹名
//                    deletePath=filesname;
//
//                    //获得本机Ip（获取的是服务器的Ip）
//                    InetAddress inetAddress=InetAddress.getLocalHost();
//                    String ip=inetAddress.getHostAddress();
//
//                    //URL地址的格式：http://ip:port/文件路径
//                    if (fileDownloadUri==""){
//                        fileDownloadUri="://"+ ip+":"+request.getServerPort()+zipFilePath;
//                    }else {
//                        fileDownloadUri=fileDownloadUri+","+request.getScheme()+"://"+ ip+":"+request.getServerPort()+zipFilePath;
//                    }
//                    System.out.println("fileDownloadUri");
//                    System.out.println(fileDownloadUri);
//
//                }catch (Exception e){
//                    System.out.println(e);
//                }

//
//                // 删除源文件
//                try {
//                    System.out.println("删除文件的路径: "+deletePath);
//                    FileUtils.deleteDirectory(new File(deletePath));
//                    System.out.println("删除成功");
//                }catch (Exception e){
//                    System.out.println(e);
//                }

            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("报错了...");
            }
        }
        return i;
    }


}