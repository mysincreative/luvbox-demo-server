package dao;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * TbCategory entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_category" )
public class TbCategory implements java.io.Serializable {

	// Fields

	private Integer id;
	private String category;
	private Timestamp createTime;
	private List<TbTemplateCategory> tbTemplateCategories = new ArrayList<TbTemplateCategory>(
			0);

	// Constructors

	/** default constructor */
	public TbCategory() {
	}

	/** minimal constructor */
	public TbCategory(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public TbCategory(Integer id, String category, Timestamp createTime,
			List<TbTemplateCategory> tbTemplateCategories) {
		this.id = id;
		this.category = category;
		this.createTime = createTime;
		this.tbTemplateCategories = tbTemplateCategories;
	}

	// Property accessors
	@Id
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "category", length = 45)
	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Column(name = "createTime", length = 19)
	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbCategory")
	public List<TbTemplateCategory> getTbTemplateCategories() {
		return this.tbTemplateCategories;
	}

    public void setTbTemplateCategories(List<TbTemplateCategory> tbTemplateCategories) {
        this.tbTemplateCategories = tbTemplateCategories;
    }

}