package dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * TbTags entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_tags" )
public class TbTags implements java.io.Serializable {

	// Fields

	private String tag;
	private String tagDescription;
	private Set<TbTemplateTags> tbTemplateTagses = new HashSet<TbTemplateTags>(
			0);

	// Constructors

	/** default constructor */
	public TbTags() {
	}

	/** minimal constructor */
	public TbTags(String tag) {
		this.tag = tag;
	}

	/** full constructor */
	public TbTags(String tag, String tagDescription,
			Set<TbTemplateTags> tbTemplateTagses) {
		this.tag = tag;
		this.tagDescription = tagDescription;
		this.tbTemplateTagses = tbTemplateTagses;
	}

	// Property accessors
	@Id
	@Column(name = "tag", unique = true, nullable = false, length = 45)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "tagDescription")
	public String getTagDescription() {
		return this.tagDescription;
	}

	public void setTagDescription(String tagDescription) {
		this.tagDescription = tagDescription;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbTags")
	public Set<TbTemplateTags> getTbTemplateTagses() {
		return this.tbTemplateTagses;
	}

	public void setTbTemplateTagses(Set<TbTemplateTags> tbTemplateTagses) {
		this.tbTemplateTagses = tbTemplateTagses;
	}

}