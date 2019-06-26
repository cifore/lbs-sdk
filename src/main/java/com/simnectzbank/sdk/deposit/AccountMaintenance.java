package com.simnectzbank.sdk.deposit;

import com.simnectzbank.sdk.utils.CommonMethod;

import java.util.Properties;

public class AccountMaintenance {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String accountClosure(String token, String messageid, String clientid, String accountNumber){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/accountClosure/{accountNumber}";
        String url = properties.getProperty("accountClosure") + accountNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }

}
