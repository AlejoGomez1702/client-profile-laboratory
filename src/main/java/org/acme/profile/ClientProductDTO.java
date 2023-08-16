package org.acme.profile;

import java.util.Map;

import software.amazon.awssdk.services.dynamodb.model.AttributeValue;

public class ClientProductDTO {
    //................................................PD#CLI...........................................
    private String PK;
    private String SK;
    private String client_id;
    private String client_typeid;
    private Boolean is_data_update;
    private Integer data_update_days;
    private Integer family_group_role;
    //................................................PD#AH, PD#BC PD#FM, PD#CD, PD#FI and PD#ES.........................................
    private String product_id;
    private String product_name;
    private String company;
    private String product_type;
    private String product_subtype;
    private String opening_date;
    private Integer product_status;
    private Boolean is_visible;
    private String product_original_id;
    private String principal_account;
    private String debit_card;
    private Integer debit_card_status;
    private Boolean has_pending_debit_card;
    private Integer account_status;
    private Integer account_lock;
    private Integer transactional_lock;
    private Integer repo_indicator;
    private Boolean has_repo_balance;
    private Integer pockets_number;
    private Integer total_balance;
    private String update_time;

    //................................................PD#TC and PD#FM...........................................
    private Integer credit_limit;
    private Integer available_credit;
    private Integer cash_advance_limit;
    private String due_date;
    private Integer minimum_payment;
    private Integer total_payment;
    private Integer pending_payment;
    private Integer past_due_days;
    private Integer past_due_amount;
    //................................................PD#TA...........................................
    private String authorized_id;
    private String authorized_typeid;
    //................................................Methods...........................................

    public static ClientProductDTO from(Map<String, AttributeValue> item) 
	{
    	ClientProductDTO clientProductData = new ClientProductDTO();
        if (item != null && !item.isEmpty()) 
        {
        	clientProductData.setProduct_status( Integer.parseInt(item.get("product_status").s()) );
        	// *************************************************
        	// .... Mapear el resto de campos que hacen falta
        	// *************************************************
        }
        
        return clientProductData;
    }

    public String getPK() {
        return PK;
    }

    public void setPK(String PK) {
        this.PK = PK;
    }

    public String getSK() {
        return SK;
    }

    public void setSK(String SK) {
        this.SK = SK;
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_typeid() {
        return client_typeid;
    }

    public void setClient_typeid(String client_typeid) {
        this.client_typeid = client_typeid;
    }

    public Boolean getIs_data_update() {
        return is_data_update;
    }

    public void setIs_data_update(Boolean is_data_update) {
        this.is_data_update = is_data_update;
    }

    public Integer getData_update_days() {
        return data_update_days;
    }

    public void setData_update_days(Integer data_update_days) {
        this.data_update_days = data_update_days;
    }

    public Integer getFamily_group_role() {
        return family_group_role;
    }

    public void setFamily_group_role(Integer family_group_role) {
        this.family_group_role = family_group_role;
    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_subtype() {
        return product_subtype;
    }

    public void setProduct_subtype(String product_subtype) {
        this.product_subtype = product_subtype;
    }

    public String getOpening_date() {
        return opening_date;
    }

    public void setOpening_date(String opening_date) {
        this.opening_date = opening_date;
    }

    public Integer getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Integer product_status) {
        this.product_status = product_status;
    }

    public Boolean getIs_visible() {
        return is_visible;
    }

    public void setIs_visible(Boolean is_visible) {
        this.is_visible = is_visible;
    }

    public String getProduct_original_id() {
        return product_original_id;
    }

    public void setProduct_original_id(String product_original_id) {
        this.product_original_id = product_original_id;
    }

    public String getPrincipal_account() {
        return principal_account;
    }

    public void setPrincipal_account(String principal_account) {
        this.principal_account = principal_account;
    }

    public String getDebit_card() {
        return debit_card;
    }

    public void setDebit_card(String debit_card) {
        this.debit_card = debit_card;
    }

    public Integer getDebit_card_status() {
        return debit_card_status;
    }

    public void setDebit_card_status(Integer debit_card_status) {
        this.debit_card_status = debit_card_status;
    }

    public Boolean getHas_pending_debit_card() {
        return has_pending_debit_card;
    }

    public void setHas_pending_debit_card(Boolean has_pending_debit_card) {
        this.has_pending_debit_card = has_pending_debit_card;
    }

    public Integer getAccount_status() {
        return account_status;
    }

    public void setAccount_status(Integer account_status) {
        this.account_status = account_status;
    }

    public Integer getAccount_lock() {
        return account_lock;
    }

    public void setAccount_lock(Integer account_lock) {
        this.account_lock = account_lock;
    }

    public Integer getTransactional_lock() {
        return transactional_lock;
    }

    public void setTransactional_lock(Integer transactional_lock) {
        this.transactional_lock = transactional_lock;
    }

    public Integer getRepo_indicator() {
        return repo_indicator;
    }

    public void setRepo_indicator(Integer repo_indicator) {
        this.repo_indicator = repo_indicator;
    }

    public Boolean getHas_repo_balance() {
        return has_repo_balance;
    }

    public void setHas_repo_balance(Boolean has_repo_balance) {
        this.has_repo_balance = has_repo_balance;
    }

    public Integer getPockets_number() {
        return pockets_number;
    }

    public void setPockets_number(Integer pockets_number) {
        this.pockets_number = pockets_number;
    }

    public Integer getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(Integer total_balance) {
        this.total_balance = total_balance;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(Integer credit_limit) {
        this.credit_limit = credit_limit;
    }

    public Integer getAvailable_credit() {
        return available_credit;
    }

    public void setAvailable_credit(Integer available_credit) {
        this.available_credit = available_credit;
    }

    public Integer getCash_advance_limit() {
        return cash_advance_limit;
    }

    public void setCash_advance_limit(Integer cash_advance_limit) {
        this.cash_advance_limit = cash_advance_limit;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public Integer getMinimum_payment() {
        return minimum_payment;
    }

    public void setMinimum_payment(Integer minimum_payment) {
        this.minimum_payment = minimum_payment;
    }

    public Integer getTotal_payment() {
        return total_payment;
    }

    public void setTotal_payment(Integer total_payment) {
        this.total_payment = total_payment;
    }

    public Integer getPending_payment() {
        return pending_payment;
    }

    public void setPending_payment(Integer pending_payment) {
        this.pending_payment = pending_payment;
    }

    public Integer getPast_due_days() {
        return past_due_days;
    }

    public void setPast_due_days(Integer past_due_days) {
        this.past_due_days = past_due_days;
    }

    public Integer getPast_due_amount() {
        return past_due_amount;
    }

    public void setPast_due_amount(Integer past_due_amount) {
        this.past_due_amount = past_due_amount;
    }

    public String getAuthorized_id() {
        return authorized_id;
    }

    public void setAuthorized_id(String authorized_id) {
        this.authorized_id = authorized_id;
    }

    public String getAuthorized_typeid() {
        return authorized_typeid;
    }

    public void setAuthorized_typeid(String authorized_typeid) {
        this.authorized_typeid = authorized_typeid;
    }
}
