package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "customerInfo",
        "updated_at",
        "created_at",
        "fx",
        "acquirer",
        "transaction",
        "refundable",
        "merchant",
        "ipn"
})
public class TransactionListData {
    @JsonProperty("customerInfo")
    private TransactionListDataCustomerInfo customerInfo;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("fx")
    private Fx fx;
    @JsonProperty("acquirer")
    private Acquirer acquirer;
    @JsonProperty("transaction")
    private Transaction transaction;
    @JsonProperty("refundable")
    private Boolean refundable;
    @JsonProperty("merchant")
    private Merchant merchant;
    @JsonProperty("ipn")
    private Ipn ipn;
}
