package com.bmob.bmobpushdemo;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/7/26.
 */
public class MyMessage extends BmobObject {
    String userID;
    String content;
    Boolean safe;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getSafe() {
        return safe;
    }

    public void setSafe(Boolean safe) {
        this.safe = safe;
    }
}
