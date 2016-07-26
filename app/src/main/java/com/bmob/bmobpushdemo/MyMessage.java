package com.bmob.bmobpushdemo;

import cn.bmob.v3.BmobObject;

/**
 * Created by Administrator on 2016/7/26.
 */
public class MyMessage extends BmobObject {
    String content;
    Boolean safe;

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
