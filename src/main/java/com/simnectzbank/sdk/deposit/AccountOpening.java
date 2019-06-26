package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class AccountOpening {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String currentAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/currentAccountOpening";
        String url = properties.getProperty("currentAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String feAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/feAccountOpening";
        String url = properties.getProperty("feAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String metAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/metAccountOpening";
        String url = properties.getProperty("metAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String savingAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/savingAccountOpening";
        String url = properties.getProperty("savingAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String tdAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/tdAccountOpening";
        String url = properties.getProperty("tdAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String accountCreation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/accountCreation";
        String url = properties.getProperty("accountCreation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


}
