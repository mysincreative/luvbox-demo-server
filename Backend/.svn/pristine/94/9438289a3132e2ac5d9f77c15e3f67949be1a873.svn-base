package dao;

import dto.AttachmentType;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 11/21/13
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name ="tb_request_attachment")
public class TbRequestAttachment {
    private Integer id;
    private TbRequest request;
    private String attachmentFilePath;
    private String attachmentDescription;
    private Timestamp createDate;
    private TbUser uploadBy;
    private AttachmentType type;
    private Boolean isChooise;

    // Property accessors
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requestId")
    public TbRequest getRequest() {
        return request;
    }

    public void setRequest(TbRequest request) {
        this.request = request;
    }

    @Column(name ="attachmentFilePath")
    public String getAttachmentFilePath() {
        return attachmentFilePath;
    }

    public void setAttachmentFilePath(String attachmentFilePath) {
        this.attachmentFilePath = attachmentFilePath;
    }

    @Column(name ="attachmentDescription")
    public String getAttachmentDescription() {
        return attachmentDescription;
    }

    public void setAttachmentDescription(String attachmentDescription) {
        this.attachmentDescription = attachmentDescription;
    }

    @Column(name ="createTime")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    public TbUser getUploadBy() {
        return uploadBy;
    }

    public void setUploadBy(TbUser uploadBy) {
        this.uploadBy = uploadBy;
    }

    @Column(name ="createDate")
    @Enumerated(EnumType.STRING)
    public AttachmentType getType() {
        return type;
    }

    public void setType(AttachmentType type) {
        this.type = type;
    }

    @Column(name ="isChooise")
    public Boolean getChooise() {
        return isChooise;
    }

    public void setChooise(Boolean chooise) {
        isChooise = chooise;
    }
}
