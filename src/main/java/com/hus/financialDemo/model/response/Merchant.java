package com.hus.financialDemo.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "allowPartialRefund",
        "allowPartialCapture"
})
public class Merchant {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("allowPartialRefund")
    private Boolean allowPartialRefund;
    @JsonProperty("allowPartialCapture")
    private Boolean allowPartialCapture;
}
