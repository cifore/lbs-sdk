package com.csi.lbs.lbssdk.SimnectzBanking;

import com.csi.lbs.lbssdk.utils.CommonMethod;

import java.util.Properties;

public class SimnectzBank {

    private CommonMethod common = new CommonMethod();
    private Properties properties = common.urlPro();

    public String sb_accountDetails_accountNumber(String token, String messageid, String clientid, String accountNumber){
        String url = properties.getProperty("accountDetails_accountNumber") + accountNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }

    public String sb_accountNumberValidation(String token, String messageid, String clientid, String json){
        String url = properties.getProperty("accountNumberValidation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }

    public String sb_customerNumber(String token, String messageid, String clientid, String customerNumber){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/allAccounts/REPLACE_THIS_VALUE";
        String url = properties.getProperty("customerNumber") + customerNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }

    public String sb_accountClosure_accountNumber(String token, String messageid, String clientid, String accountNumber){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/accountClosure/{accountNumber}";
        String url = properties.getProperty("accountClosure_accountNumber") + accountNumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_accountCreation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/accountCreation";
        String url = properties.getProperty("accountCreation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_currentAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/currentAccountOpening";
        String url = properties.getProperty("currentAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_feAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/feAccountOpening";
        String url = properties.getProperty("feAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_metAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/metAccountOpening";
        String url = properties.getProperty("metAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_savingAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/savingAccountOpening";
        String url = properties.getProperty("savingAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_tdAccountOpening(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/tdAccountOpening";
        String url = properties.getProperty("tdAccountOpening");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_custContactInfoUpdate(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/custContactInfoUpdate";
        String url = properties.getProperty("custContactInfoUpdate");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_customerCreation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/customerCreation";
        String url = properties.getProperty("customerCreation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_termDepositApplication(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositApplication";
        String url = properties.getProperty("termDepositApplication");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_termDepositDrawDown(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositDrawDown";
        String url = properties.getProperty("termDepositDrawDown");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_termDepositEnquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositEnquiry";
        String url = properties.getProperty("termDepositEnquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_termDepositRenewal(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/term/termDepositRenewal";
        String url = properties.getProperty("termDepositRenewal");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_chequeBookCreation(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/chequeBookCreation";
        String url = properties.getProperty("chequeBookCreation");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_deposit(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/deposit";
        String url = properties.getProperty("deposit");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_transfer(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/transfer";
        String url = properties.getProperty("transfer");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_withdrawal(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/account/withdrawal";
        String url = properties.getProperty("withdrawal");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_enquiry(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/transactionLog/enquiry";
        String url = properties.getProperty("enquiry");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checkCurAccountType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checkCurAccountType";
        String url = properties.getProperty("checkCurAccountType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checkFexAccountType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checkFexAccountType";
        String url = properties.getProperty("checkFexAccountType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checkfundAccountType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checkfundAccountType";
        String url = properties.getProperty("checkfundAccountType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checkmetAccountType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checkmetAccountType";
        String url = properties.getProperty("checkmetAccountType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checkSavOrCurType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checkSavOrCurType";
        String url = properties.getProperty("checkSavOrCurType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checkstockAccountType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checkstockAccountType";
        String url = properties.getProperty("checkstockAccountType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_checktdAccountType(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/checktdAccountType";
        String url = properties.getProperty("checktdAccountType");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_getAccountBalance(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/getAccountBalance";
        String url = properties.getProperty("getAccountBalance");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_validateAccountNumberExists_accountNumber(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateAccountNumberExists/{accountNumber}";
        String url = properties.getProperty("validateAccountNumberExists_accountNumber");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_validateAmountFormat(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateAmountFormat";
        String url = properties.getProperty("validateAmountFormat");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_validateAssociatedAccounts_accountNumber(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateAssociatedAccounts/{accountNumber}";
        String url = properties.getProperty("validateAssociatedAccounts_accountNumber");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_currency(String token, String messageid, String clientid, String currency){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateCurrency/{currency}";
        String url = properties.getProperty("currency") + currency;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_validateCustomerID_customerID(String token, String messageid, String clientid, String customerID){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateCustomerID/{customerID}";
        String url = properties.getProperty("validateCustomerID_customerID") + customerID;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_email(String token, String messageid, String clientid, String email){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateEmailFormat/{email}";
        String url = properties.getProperty("email") + email;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_customerID(String token, String messageid, String clientid, String customerID){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateExistingCustomer/{customerID}";
        String url = properties.getProperty("customerID") + customerID;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_phone(String token, String messageid, String clientid, String phone){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validatePhoneNumberFormat/{phone}";
        String url = properties.getProperty("phone") + phone;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_period(String token, String messageid, String clientid, String period){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateContractPeriod/{period}";
        String url = properties.getProperty("period") + period;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_tdnumber(String token, String messageid, String clientid, String tdnumber){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateTDNumberExists/{tdnumber}";
        String url = properties.getProperty("tdnumber") + tdnumber;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_dateRangeValidate(String token, String messageid, String clientid, String json){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/dateRangeValidate";
        String url = properties.getProperty("dateRangeValidate");
        String result = common.httpPost(url, token, messageid, clientid, json);
        return result;
    }


    public String sb_date(String token, String messageid, String clientid, String date){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateDateFormat/{date}";
        String url = properties.getProperty("date") + date;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_time(String token, String messageid, String clientid, String time){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateTimeFormat/{time}";
        String url = properties.getProperty("time") + time;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }


    public String sb_transtype(String token, String messageid, String clientid, String transtype){
        //String url = "http://simnectzlbs.com:8086/deposit/deposit/validate/validateTransType/{transtype}";
        String url = properties.getProperty("transtype") + transtype;
        String result = common.httpGet(url,token,messageid,clientid);
        return result;
    }
}
