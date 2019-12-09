package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "created_at",
        "updated_at",
        "deleted_at",
        "number",
        "expiryMonth",
        "expiryYear",
        "startMonth",
        "startYear",
        "issueNumber",
        "email",
        "birthday",
        "gender",
        "billingTitle",
        "billingFirstName",
        "billingLastName",
        "billingCompany",
        "billingAddress1",
        "billingAddress2",
        "billingCity",
        "billingPostcode",
        "billingState",
        "billingCountry",
        "billingPhone",
        "billingFax",
        "shippingTitle",
        "shippingFirstName",
        "shippingLastName",
        "shippingCompany",
        "shippingAddress1",
        "shippingAddress2",
        "shippingCity",
        "shippingPostcode",
        "shippingState",
        "shippingCountry",
        "shippingPhone",
        "shippingFax",
        "token"
})
public class CustomerInfo {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("deleted_at")
    private Object deletedAt;
    @JsonProperty("number")
    private String number;
    @JsonProperty("expiryMonth")
    private String expiryMonth;
    @JsonProperty("expiryYear")
    private String expiryYear;
    @JsonProperty("startMonth")
    private Object startMonth;
    @JsonProperty("startYear")
    private Object startYear;
    @JsonProperty("issueNumber")
    private Object issueNumber;
    @JsonProperty("email")
    private String email;
    @JsonProperty("birthday")
    private String birthday;
    @JsonProperty("gender")
    private Object gender;
    @JsonProperty("billingTitle")
    private Object billingTitle;
    @JsonProperty("billingFirstName")
    private String billingFirstName;
    @JsonProperty("billingLastName")
    private String billingLastName;
    @JsonProperty("billingCompany")
    private Object billingCompany;
    @JsonProperty("billingAddress1")
    private String billingAddress1;
    @JsonProperty("billingAddress2")
    private Object billingAddress2;
    @JsonProperty("billingCity")
    private String billingCity;
    @JsonProperty("billingPostcode")
    private String billingPostcode;
    @JsonProperty("billingState")
    private Object billingState;
    @JsonProperty("billingCountry")
    private String billingCountry;
    @JsonProperty("billingPhone")
    private Object billingPhone;
    @JsonProperty("billingFax")
    private Object billingFax;
    @JsonProperty("shippingTitle")
    private Object shippingTitle;
    @JsonProperty("shippingFirstName")
    private String shippingFirstName;
    @JsonProperty("shippingLastName")
    private String shippingLastName;
    @JsonProperty("shippingCompany")
    private Object shippingCompany;
    @JsonProperty("shippingAddress1")
    private String shippingAddress1;
    @JsonProperty("shippingAddress2")
    private Object shippingAddress2;
    @JsonProperty("shippingCity")
    private String shippingCity;
    @JsonProperty("shippingPostcode")
    private String shippingPostcode;
    @JsonProperty("shippingState")
    private Object shippingState;
    @JsonProperty("shippingCountry")
    private String shippingCountry;
    @JsonProperty("shippingPhone")
    private Object shippingPhone;
    @JsonProperty("shippingFax")
    private Object shippingFax;
    @JsonProperty("token")
    private Object token;
}
