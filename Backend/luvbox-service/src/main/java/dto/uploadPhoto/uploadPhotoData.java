package dto.uploadPhoto;

import java.io.InputStream;
import com.sun.jersey.core.header.FormDataContentDisposition;


/**
 * Created by m00246-quyen on 10/13/15.
 */
public class uploadPhotoData {
    //Couple ID
    private String coupleID;
    //Upload UserID
    private String upUserID;
    //Photo Capture text
    private String captureText;
    //Photo
    private InputStream uploadedInputStream;
    //Photo Detail
    private FormDataContentDisposition Detail;

    public String getCoupleID() {
        return coupleID;
    }

    public void setCoupleID(String coupleID) {
        this.coupleID = coupleID;
    }

    public String getUpUserID() {
        return upUserID;
    }

    public void setUpUserID(String upUserID) {
        this.upUserID = upUserID;
    }

    public String getCaptureText() {
        return captureText;
    }

    public void setCaptureText(String captureText) {
        this.captureText = captureText;
    }

    public InputStream getUploadedInputStream() {
        return uploadedInputStream;
    }

    public void setUploadedInputStream(InputStream uploadedInputStream) {
        this.uploadedInputStream = uploadedInputStream;
    }

    public FormDataContentDisposition getDetail() {
        return Detail;
    }

    public void setDetail(FormDataContentDisposition detail) {
        Detail = detail;
    }
}
