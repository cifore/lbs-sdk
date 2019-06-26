package com.simnectzbank.sdk.creditcard;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class Merchant {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String merchantEnquiry(String token, String messageid, String clientid, String merchantNumber){
        //String url = "http://simnectzlbs.com:8086/creditcard/merchant/merchantEnquiry/REPLACE_THIS_VALUE";
        String url = properties.getProperty("merchantEnquiry") + merchantNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }

    public String transactions(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/merchant/transactions";
        String url = properties.getProperty("transactions");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

}
