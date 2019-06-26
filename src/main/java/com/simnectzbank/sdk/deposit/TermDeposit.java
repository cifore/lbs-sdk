package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class TermDeposit {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String termDepositApplication(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositApplication";
        String url = properties.getProperty("termDepositApplication");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String termDepositDrawDown(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositDrawDown";
        String url = properties.getProperty("termDepositDrawDown");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String termDepositEnquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositEnquiry";
        String url = properties.getProperty("termDepositEnquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String termDepositRenewal(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositRenewal";
        String url = properties.getProperty("termDepositRenewal");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }
}
