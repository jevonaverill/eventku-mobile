package com.jevonaverill.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jevonaverill.datamodel.EventModel;

import java.util.List;

/**
 * Created by jevon.averill on 14/10/17.
 */

public class EventResponse {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("results")
    @Expose
    private List<EventModel> results = null;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<EventModel> getResults() {
        return results;
    }

    public void setResults(List<EventModel> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
