package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class Transaction {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String transfer(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/transfer";
        String url = properties.getProperty("transfer");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String deposit(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/deposit";
        String url = properties.getProperty("deposit");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String withdrawal(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/withdrawal";
        String url = properties.getProperty("withdrawal");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String chequeBookCreation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/chequeBookCreation";
        String url = properties.getProperty("chequeBookCreation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }
}
