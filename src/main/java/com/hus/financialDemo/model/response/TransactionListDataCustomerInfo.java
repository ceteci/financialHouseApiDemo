package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "number",
        "email",
        "billingFirstName",
        "billingLastName"
})
public class TransactionListDataCustomerInfo {
    @JsonProperty("number")
    private String number;
    @JsonProperty("email")
    private String email;
    @JsonProperty("billingFirstName")
    private String billingFirstName;
    @JsonProperty("billingLastName")
    private String billingLastName;
}
