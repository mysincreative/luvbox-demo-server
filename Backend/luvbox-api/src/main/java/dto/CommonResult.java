package dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by haminhthanh on 9/23/15.
 */

public class CommonResult {
    private int status;
    private String errorMessage;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

}
