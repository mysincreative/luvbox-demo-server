package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbTemplateCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_template_category" )
public class TbTemplateCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbTemplate tbTemplate;
	private TbCategory tbCategory;

	// Constructors

	/** default constructor */
	public TbTemplateCategory() {
	}

	/** full constructor */
	public TbTemplateCategory(Integer id, TbTemplate tbTemplate,
			TbCategory tbCategory) {
		this.id = id;
		this.tbTemplate = tbTemplate;
		this.tbCategory = tbCategory;
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
	@JoinColumn(name = "templateID", nullable = false)
	public TbTemplate getTbTemplate() {
		return this.tbTemplate;
	}

	public void setTbTemplate(TbTemplate tbTemplate) {
		this.tbTemplate = tbTemplate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoryID", nullable = false)
	public TbCategory getTbCategory() {
		return this.tbCategory;
	}

	public void setTbCategory(TbCategory tbCategory) {
		this.tbCategory = tbCategory;
	}


}