package com.hus.financialDemo.model.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.function.Consumer;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fromDate",
        "toDate",
        "merchant",
        "acquirer"
})
public class TransactionReportRequest {
    @JsonProperty("fromDate")
    private String fromDate;
    @JsonProperty("toDate")
    private String toDate;
    @JsonProperty("merchant")
    private Integer merchant;
    @JsonProperty("acquirer")
    private Integer acquirer;

    public TransactionReportRequest(Consumer<TransactionReportRequest> builder) {
        builder.accept(this);
    }
}
