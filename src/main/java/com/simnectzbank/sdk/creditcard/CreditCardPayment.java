package com.simnectzbank.sdk.creditcard;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class CreditCardPayment {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String creditCardRepeyment(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/creditCardRepeyment";
        String url = properties.getProperty("creditCardRepeyment");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String outstandingPayment(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/outstandingPayment";
        String url = properties.getProperty("outstandingPayment");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }




}
