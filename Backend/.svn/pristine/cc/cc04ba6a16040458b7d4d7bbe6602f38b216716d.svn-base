package dao;

import dto.RequestType;
import dto.Status;

import javax.persistence.*;
import java.util.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbRequest entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_request")
public class TbRequest implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbUser tbUser;
	private Date requestTime;
	private List<TbRequestMessage> tbRequestMessages = new ArrayList<TbRequestMessage>(
			0);
    private RequestType requestType;
    private String title;
    private TbUser personInCharge;
    private Integer currentStep;
    private Date updateTime;
    private Status currentStatus;
    private List<TbRequestTemplate> templates = new ArrayList<TbRequestTemplate>(0);
    private Integer rejectCount;
    private Date deadLineOfReject;
    private String description;
    private Float length;
    private Float width;
    private Double actualPrice;
    private Integer numberOfFloors;
    private List<TbPaymentInfo> payments = new ArrayList<TbPaymentInfo>(0);
    private List<TbRequestAttachment> attachments = new ArrayList<TbRequestAttachment>(0);
    private List<TbRequestLog> requestLogs = new ArrayList<TbRequestLog>(0);
	// Constructorssas  s

	/** default constructor */
	public TbRequest() {
	}

	/** full constructor */
	public TbRequest(TbUser tbUser, Date requestTime,
                     List<TbRequestMessage> tbRequestMessages) {
		this.tbUser = tbUser;
		this.requestTime = requestTime;
		this.tbRequestMessages = tbRequestMessages;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    @Column(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="requestType")
    @Enumerated(EnumType.STRING)
    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Column(name="currentStatus")
    public Status getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(Status currentStatus) {
        this.currentStatus = currentStatus;
    }

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uid")
	public TbUser getTbUser() {
		return this.tbUser;
	}

	public void setTbUser(TbUser tbUser) {
		this.tbUser = tbUser;
	}

    @Temporal(TemporalType.TIMESTAMP)
	@Column(name = "requestTime")
	public Date getRequestTime() {
		return this.requestTime;
	}

	public void setRequestTime(Date requestTime) {
		this.requestTime = requestTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbRequest")
	public List<TbRequestMessage> getTbRequestMessages() {
		return this.tbRequestMessages;
	}

	public void setTbRequestMessages(List<TbRequestMessage> tbRequestMessages) {
		this.tbRequestMessages = tbRequestMessages;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personInCharge")
    public TbUser getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(TbUser personInCharge) {
        this.personInCharge = personInCharge;
    }


    @Column(name = "currentStep")
    public Integer getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Integer currentStep) {
        this.currentStep = currentStep;
    }



    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateTime")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


    @Column(name = "length")
    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    @Column(name = "width")
    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbRequest")
	public List<TbRequestTemplate> getTemplates() {
		return templates;
	}

	public void setTemplates(List<TbRequestTemplate> templates) {
		this.templates = templates;
	}

	@Column(name ="rejectCount")
	public Integer getRejectCount() {
		return rejectCount;
	}

	public void setRejectCount(Integer rejectCount) {
		this.rejectCount = rejectCount;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deadLineOfReject")
	public Date getDeadLineOfReject() {
		return deadLineOfReject;
	}

	public void setDeadLineOfReject(Date deadLineOfReject) {
		this.deadLineOfReject = deadLineOfReject;
	}


    @Column(name ="description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name ="actualPrice")
    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public Integer getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(Integer numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }



    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "request")
    public List<TbPaymentInfo> getPayments() {
        return payments;
    }

    public void setPayments(List<TbPaymentInfo> payments) {
        this.payments = payments;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "request")
    public List<TbRequestAttachment> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<TbRequestAttachment> attachments) {
        this.attachments = attachments;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "request")
    public List<TbRequestLog> getRequestLogs() {
        return requestLogs;
    }

    public void setRequestLogs(List<TbRequestLog> requestLogs) {
        this.requestLogs = requestLogs;
    }
}