package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class CustomerMaintenance {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String customerCreation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/customerCreation";
        String url = properties.getProperty("customerCreation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String custContactInfoUpdate(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/custContactInfoUpdate";
        String url = properties.getProperty("custContactInfoUpdate");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

}
