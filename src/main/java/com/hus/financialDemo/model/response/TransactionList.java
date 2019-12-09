package com.hus.financialDemo.model.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "per_page",
        "current_page",
        "next_page_url",
        "prev_page_url",
        "from",
        "to",
        "data"
})
public class TransactionList {
    @JsonProperty("per_page")
    private Integer perPage;
    @JsonProperty("current_page")
    private Integer currentPage;
    @JsonProperty("next_page_url")
    private String nextPageUrl;
    @JsonProperty("prev_page_url")
    private Object prevPageUrl;
    @JsonProperty("from")
    private Integer from;
    @JsonProperty("to")
    private Integer to;
    @JsonProperty("data")
    private List<TransactionListData> data = null;
}
