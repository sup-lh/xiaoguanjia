
Page({
  submit:function(res){
    var data = res.detail.value
    var loginName = data.loginName
    var password =  data.password
    if(loginName == null || loginName == ''){
      wx.showToast({
        title: '请输入账号',
        icon:'error',
        duration:2000
      })
    }else if(password == null || password == ''){
      wx.showToast({
        title: '请输入密码',
        icon:'error',
        duration:2000
      })
    }else{
      console.log(data)
      wx.request({
        url: 'https://xcx.suplin.fun/user/login',
        method:'POST',
        data:data,
        success:function(res){
          console.log(res)
          var resp = res.data
          if(resp.success){
            wx.showToast({
              title: '登录成功',
              icon:'success',
              duration:2000
            })
            wx.redirectTo({
              url: '../selection/selection',
            })
          }else{
            wx.showToast({
              title: resp.message,
              icon:'error',
              duration:2000
            })
          }
        }
      })
    }
  },
  data: {

  },
  // 事件处理函数

  onLoad() {
  },


})
