package dao;

import dto.Status;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbRequestMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_request_message" )
public class TbRequestMessage implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer currentStep;
	private TbRequest tbRequest;
	private String requestMessage;
	private Date createTime;
    private Boolean isReaded;
    private TbUser fromUser;
    private Boolean isAuto;
	// Constructors

	/** default constructor */
	public TbRequestMessage() {
	}

	/** minimal constructor */
	public TbRequestMessage(Integer id) {
		this.id = id;
	}



	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
    @GeneratedValue(strategy = IDENTITY)
    public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    @Column(name="currentStep")
    public Integer getCurrentStep() {
        return currentStep;
    }

    public void setCurrentStep(Integer currentStep) {
        this.currentStep = currentStep;
    }

    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "requestId")
	public TbRequest getTbRequest() {
		return this.tbRequest;
	}

	public void setTbRequest(TbRequest tbRequest) {
		this.tbRequest = tbRequest;
	}

	@Column(name = "requestMessage", length = 255)
	public String getRequestMessage() {
		return this.requestMessage;
	}

	public void setRequestMessage(String requestMessage) {
		this.requestMessage = requestMessage;
	}

	@Column(name = "createTime", length = 45)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "isReaded")
	public Boolean getIsReaded() {
		return this.isReaded;
	}

	public void setIsReaded(Boolean isReaded) {
		this.isReaded = isReaded;
	}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tbRequestMessages")
    public TbUser getFromUser() {
        return fromUser;
    }

    public void setFromUser(TbUser fromUser) {
        this.fromUser = fromUser;
    }

    @Column(name = "isAuto")
    public Boolean getAuto() {
        return isAuto;
    }

    public void setAuto(Boolean auto) {
        isAuto = auto;
    }
}