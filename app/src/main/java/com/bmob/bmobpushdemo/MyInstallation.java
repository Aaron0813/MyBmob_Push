package com.bmob.bmobpushdemo;

import android.content.Context;

import cn.bmob.v3.BmobInstallation;

/**
 * Created by Administrator on 2016/7/27.
 */
public class MyInstallation extends BmobInstallation {
    String userID;

    public MyInstallation(Context context) {
        super(context);
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
