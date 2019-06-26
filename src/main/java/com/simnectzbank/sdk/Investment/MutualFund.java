package com.simnectzbank.sdk.Investment;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class MutualFund {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String fundAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/fund/fundAccountOpening";
        String url = properties.getProperty("fundAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String holdingEnquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/fund/holdingEnquiry";
        String url = properties.getProperty("holdingEnquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String redemption(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/fund/redemption";
        String url = properties.getProperty("redemption");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String subscription(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/fund/subscription";
        String url = properties.getProperty("subscription");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

}
