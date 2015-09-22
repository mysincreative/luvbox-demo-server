package dao;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbTemplateTags entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_template_tags" )
public class TbTemplateTags implements java.io.Serializable {

	// Fields

	private Integer id;
	private TbTemplate tbTemplate;
	private TbTags tbTags;

	// Constructors

	/** default constructor */
	public TbTemplateTags() {
	}

	/** minimal constructor */
	public TbTemplateTags(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TbTemplateTags(Integer id, TbTemplate tbTemplate, TbTags tbTags) {
		this.id = id;
		this.tbTemplate = tbTemplate;
		this.tbTags = tbTags;
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
	@JoinColumn(name = "templateID")
	public TbTemplate getTbTemplate() {
		return this.tbTemplate;
	}

	public void setTbTemplate(TbTemplate tbTemplate) {
		this.tbTemplate = tbTemplate;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tag")
	public TbTags getTbTags() {
		return this.tbTags;
	}

	public void setTbTags(TbTags tbTags) {
		this.tbTags = tbTags;
	}

}