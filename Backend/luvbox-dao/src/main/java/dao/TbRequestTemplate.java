package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbRequestTemplate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_request_template" )
public class TbRequestTemplate implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbTemplate tbTemplate;
	private TbRequest tbRequest;
	private Boolean isChooise;
    private Double price;
	// Constructors

	/** default constructor */
	public TbRequestTemplate() {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "templateId", nullable = false)
	public TbTemplate getTbTemplate() {
		return this.tbTemplate;
	}

	public void setTbTemplate(TbTemplate tbTemplate) {
		this.tbTemplate = tbTemplate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "requestId", nullable = false)
    public TbRequest getTbRequest() {
        return tbRequest;
    }

    public void setTbRequest(TbRequest tbRequest) {
        this.tbRequest = tbRequest;
    }

    @Column(name ="isChooise")
	public Boolean getIsChooise() {
		return isChooise;
	}


	public void setIsChooise(Boolean isChooise) {
		this.isChooise = isChooise;
	}

    @Column(name="price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}