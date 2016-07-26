package com.bmob.bmobpushdemo;


import cn.bmob.v3.BmobObject;
import cn.bmob.v3.BmobQuery;

/**
 * Created by Administrator on 2016/7/23.
 */
public class Person extends BmobObject {
    private String name;
    private String address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public static BmobQuery<Person> getQuery() {
        return new BmobQuery();
    }
}
