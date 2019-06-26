package com.simnectzbank.sdk.creditcard;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class CreditCard {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String accountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/accountOpening";
        String url = properties.getProperty("accountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String cancellation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/cancellation";
        String url = properties.getProperty("cancellation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String creditLimitDetails(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/creditLimitDetails";
        String url = properties.getProperty("creditLimitDetails");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String limitDecrease(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/limitDecrease";
        String url = properties.getProperty("limitDecrease");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String limitIncrease(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/limitIncrease";
        String url = properties.getProperty("limitIncrease");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String lossReporting(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/lossReporting";
        String url = properties.getProperty("lossReporting");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String numberValidation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/numberValidation";
        String url = properties.getProperty("numberValidation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

}
