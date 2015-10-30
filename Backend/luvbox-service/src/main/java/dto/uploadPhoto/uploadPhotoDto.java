package dto.uploadPhoto;

import com.sun.jersey.core.header.FormDataContentDisposition;

import java.io.InputStream;
import java.sql.Timestamp;

/**
 * Created by m00246-quyen on 10/30/15.
 */
public abstract class uploadPhotoDto {
    //Couple ID
    private String coupleID;
    //Upload UserID
    private String upUserID;
    //photo
    private InputStream uploadedInputStream;
    //photo Detail
    private FormDataContentDisposition Detail;
    //update date
    private Timestamp update_date;
    //create date
    private Timestamp create_date;

    /**
     * CoupleID getter
     * @return coupleID
     */
    public String getCoupleID() {
        return coupleID;
    }

    /**
     * coupleID setter
     * @param coupleID
     */
    public void setCoupleID(String coupleID) {
        this.coupleID = coupleID;
    }

    /**
     * UpUserID getter
     * @return upUserID
     */
    public String getUpUserID() {
        return upUserID;
    }

    /**
     * upUserID setter
     * @param upUserID
     */
    public void setUpUserID(String upUserID) {
        this.upUserID = upUserID;
    }

    /**
     * Photo stream getter
     * @return uploadedInputStream
     */
    public InputStream getUploadedInputStream() {
        return uploadedInputStream;
    }

    /**
     * Photo stream setter
     * @param uploadedInputStream
     */
    public void setUploadedInputStream(InputStream uploadedInputStream) {
        this.uploadedInputStream = uploadedInputStream;
    }

    /**
     * Photo Detail getter
     * @return Detail
     */
    public FormDataContentDisposition getDetail() {
        return Detail;
    }

    /**
     * Photo Detail setter
     * @param detail
     */
    public void setDetail(FormDataContentDisposition detail) {
        Detail = detail;
    }

    /**
     * update_date getter
     * @return update_date
     */
    public Timestamp getUpdate_date() {
        return update_date;
    }

    /**
     * update_date setter
     * @param update_date
     */
    public void setUpdate_date(Timestamp update_date) {
        this.update_date = update_date;
    }

    /**
     * create_date getter
     * @return create_date
     */
    public Timestamp getCreate_date() {
        return create_date;
    }

    /**
     * create_date setter
     * @param create_date
     */
    public void setCreate_date(Timestamp create_date) {
        this.create_date = create_date;
    }
}
