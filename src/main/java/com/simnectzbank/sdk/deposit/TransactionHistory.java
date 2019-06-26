package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class TransactionHistory {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String enquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/transactionLog/enquiry";
        String url = properties.getProperty("enquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

}
