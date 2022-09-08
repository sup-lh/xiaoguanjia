package com.resp;

import org.springframework.stereotype.Service;

@Service
public class commit_flag {
    private String commitFlag;

    public String getCommitFlag() {
        return commitFlag;
    }

    public void setCommitFlag(String commitFlag) {
        this.commitFlag = commitFlag;
    }

    @Override
    public String toString() {
        return "commit_flag{" +
                "commitFlag='" + commitFlag + '\'' +
                '}';
    }
}
