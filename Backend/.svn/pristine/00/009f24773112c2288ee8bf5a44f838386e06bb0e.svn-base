package dao;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * TbPaymentInfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_payment_info" )
public class TbPaymentInfo implements java.io.Serializable {

	// Fields
    private String paymentId;
	private Double payment;
	private String currency;
	private Timestamp createTime;
    private TbRequest request;
    private String contents;
    private Integer paymentType; //THANH TOAN TRUC TIEP HAY WA PAYPAL

	// Constructors

	/** default constructor */
	public TbPaymentInfo() {
	}


	@Column(name = "payment", length = 45)
	public Double getPayment() {
		return this.payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	@Column(name = "currency", length = 45)
	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Column(name = "createTime", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

    // Property accessors
    @Id
    @Column(name = "paymentId", unique = true, nullable = false)
    @GeneratedValue
    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }



    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requestId", nullable = false)
    public TbRequest getRequest() {
        return request;
    }

    public void setRequest(TbRequest request) {
        this.request = request;
    }

    @Column(name = "content")
    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    @Column(name = "paymentType")
    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }
}