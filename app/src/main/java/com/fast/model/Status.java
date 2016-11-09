package com.fast.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by 亲爱的~ on 2016/11/7.
 */
public class Status {
    private JSONObject json;
    public Status(JSONObject json){
        this.json = json;
    }
    /***
     * 格式化获取数据
     * @param info
     * @return
     */
    private String GETINFO(String info){
        String str = null;
        try {
            str = json.getString(info);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return str;
    }
    public String getStatus() {
        return GETINFO("status");
    }
    public String getStatus_code() {
        return GETINFO("status_code");
    }
    @Override
    public String toString(){
        String str = "status: "+getStatus()+
                "\nstatus_code: "+getStatus_code();
        return str;
    }
}
