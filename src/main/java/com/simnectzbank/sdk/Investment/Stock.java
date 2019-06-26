package com.simnectzbank.sdk.Investment;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class Stock {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String stkAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/investment/stock/stkAccountOpening";
        String url = properties.getProperty("stkAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String stockHoldingEnquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/investment/stock/stockHoldingEnquiry";
        String url = properties.getProperty("stockHoldingEnquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String stockTrading(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/investment/investment/stock/stockTrading";
        String url = properties.getProperty("stockTrading");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


}
