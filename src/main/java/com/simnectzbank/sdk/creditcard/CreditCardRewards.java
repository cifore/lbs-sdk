package com.simnectzbank.sdk.creditcard;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class CreditCardRewards {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String productEnquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/point/productEnquiry";
        String url = properties.getProperty("productEnquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String redemption(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/point/redemption";
        String url = properties.getProperty("point_redemption");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String redemptionHistory(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/point/redemptionHistory";
        String url = properties.getProperty("redemptionHistory");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String totalPoint(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/point/totalPoint";
        String url = properties.getProperty("totalPoint");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }



}
