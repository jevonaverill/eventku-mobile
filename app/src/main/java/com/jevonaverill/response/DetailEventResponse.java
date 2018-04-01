package com.jevonaverill.response;

import com.google.gson.annotations.SerializedName;
import com.jevonaverill.datamodel.DetailEventModel;

/**
 * Created by jevon.averill on 14/10/17.
 */

public class DetailEventResponse {


    @SerializedName("result")
    private DetailEventModel result;
    @SerializedName("status")
    private String status;
    @SerializedName("message")
    private String message;

    public DetailEventModel getResult() {
        return result;
    }

    public void setResult(DetailEventModel result) {
        this.result = result;
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
