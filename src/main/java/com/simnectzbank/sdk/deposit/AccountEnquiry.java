package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class AccountEnquiry {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String accountNumberValidation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/accountNumberValidation";
        String url = properties.getProperty("accountNumberValidation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String allAccounts(String token, String messageid, String clientid, String customerNumber){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/allAccounts/REPLACE_THIS_VALUE";
        String url = properties.getProperty("allAccounts") + customerNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }

    public String accountDetails(String token, String messageid, String clientid, String accountNumber){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/accountDetails/REPLACE_THIS_VALUE";
        String url = properties.getProperty("accountDetails") + accountNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


}
