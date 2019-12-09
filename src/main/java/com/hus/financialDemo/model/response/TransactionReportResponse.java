package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "count",
        "total",
        "currency"
})
public class TransactionReportResponse {
    @JsonProperty("count")
    private String count;
    @JsonProperty("total")
    private String total;
    @JsonProperty("currency")
    private String currency;
}
