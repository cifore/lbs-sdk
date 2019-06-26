package com.simnectzbank.sdk.creditcard;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class CreditCardTransaction {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String transactionDetails(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/transactionDetails";
        String url = properties.getProperty("transactionDetails");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String transactionPosting(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/creditcard/creditcard/transactionPosting";
        String url = properties.getProperty("transactionPosting");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

}
