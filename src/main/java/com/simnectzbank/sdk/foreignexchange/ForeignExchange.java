package com.simnectzbank.sdk.foreignexchange;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class ForeignExchange {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String foreignExchange(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/foreignexchange/foreignExchange/foreignExchange";
        String url = properties.getProperty("foreignExchange");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }
}
