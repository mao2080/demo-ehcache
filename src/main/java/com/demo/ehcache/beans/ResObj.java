package com.demo.ehcache.beans;

import org.apache.http.HttpStatus;

/**
 * @author mao2080@sina.com
 */
public class ResObj {

    /**状态代码*/
    private int code = HttpStatus.SC_OK;

    /**状态描述*/
    private String desc = "Success";

    /**返回数据*/
    private Object data;

    public ResObj() {

    }

    public ResObj(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public ResObj(Object data) {
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
