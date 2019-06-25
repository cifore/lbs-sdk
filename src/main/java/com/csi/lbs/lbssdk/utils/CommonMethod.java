package com.csi.lbs.lbssdk.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class CommonMethod {

    /**
     * 通用的GET方法
     * @param url
     * @param token
     * @param messageid
     * @param clientid
     * @return
     */
    public String httpGet(String url, String token, String messageid, String clientid){
        HttpClientUtil client = new HttpClientUtil();
        Map<String, String> headers = new HashMap<>();
        headers.put("token",token);
        headers.put("messageid",messageid);
        headers.put("clientid",clientid);
        String result = client.doGet(url,headers,null);
        return result;
    }

    /**
     * 通用的POST方法
     * @param url
     * @param token
     * @param messageid
     * @param clientid
     * @param json
     * @return
     */
    public String httpPost(String url, String token, String messageid, String clientid,String json){
        HttpClientUtil client = new HttpClientUtil();
        Map<String, String> headers = new HashMap<>();
        headers.put("token",token);
        headers.put("messageid",messageid);
        headers.put("clientid",clientid);
        String result = client.doPostJson(url,headers,json);
        return result;
    }

    /**
     * 读取配置文件
     * @return
     */
    public Properties urlPro(){
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream("application.properties");
        Properties properties = new Properties();
        try{
            properties.load(inputStream);
        }catch (IOException ioE){
            ioE.printStackTrace();
        }finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
