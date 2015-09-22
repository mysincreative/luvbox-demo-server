package dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbTemplate entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_template" )
public class TbTemplate implements java.io.Serializable {

	// Fields

	private Integer id;
	private String author;
	private String description;
	private Date createTime;
	private String title;
	private String filePath;
	private String imagePreviewUrl;
    private Long price;
	private List<TbTemplateCategory> tbTemplateCategories = new ArrayList<TbTemplateCategory>(
			0);
	private List<TbRequestTemplate> tbRequestTemplaties = new ArrayList<TbRequestTemplate>(0);
	private List<TbTemplateTags> tbTemplateTagses = new ArrayList<TbTemplateTags>(
			0);
	private Double width;
    private Double length;
	// Constructors

	/** default constructor */
	public TbTemplate() {
	}

	/** minimal constructor */
	public TbTemplate(Integer id, Date createTime, String title,
			String filePath) {
		this.id = id;
		this.createTime = createTime;
		this.title = title;
		this.filePath = filePath;
	}

	/** full constructor */
	public TbTemplate(Integer id, String author, String description,
			Date createTime, String title, String filePath,
			String imagePreviewUrl,
			List<TbTemplateCategory> tbTemplateCategories,
			List<TbRequestTemplate> tbUsertemplates,
			List<TbTemplateTags> tbTemplateTagses) {
		this.id = id;
		this.author = author;
		this.description = description;
		this.createTime = createTime;
		this.title = title;
		this.filePath = filePath;
		this.imagePreviewUrl = imagePreviewUrl;
		this.tbTemplateCategories = tbTemplateCategories;
		this.tbTemplateTagses = tbTemplateTagses;
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

	@Column(name = "Author", length = 45)
	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "Description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "CreateTime")
    @Temporal(TemporalType.TIMESTAMP)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "Title", nullable = false, length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "FilePath", nullable = false)
	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Column(name = "ImagePreviewURL")
	public String getImagePreviewUrl() {
		return this.imagePreviewUrl;
	}

	public void setImagePreviewUrl(String imagePreviewUrl) {
		this.imagePreviewUrl = imagePreviewUrl;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbTemplate")
	public List<TbTemplateCategory> getTbTemplateCategories() {
		return this.tbTemplateCategories;
	}

	public void setTbTemplateCategories(
			List<TbTemplateCategory> tbTemplateCategories) {
		this.tbTemplateCategories = tbTemplateCategories;
	}


	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbTemplate")
	public List<TbTemplateTags> getTbTemplateTagses() {
		return this.tbTemplateTagses;
	}

	public void setTbTemplateTagses(List<TbTemplateTags> tbTemplateTagses) {
		this.tbTemplateTagses = tbTemplateTagses;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbTemplate")
	public List<TbRequestTemplate> getTbRequestTemplaties() {
		return tbRequestTemplaties;
	}

	public void setTbRequestTemplaties(List<TbRequestTemplate> tbRequestTemplaties) {
		this.tbRequestTemplaties = tbRequestTemplaties;
	}

    @Column(name="price")
    public Long getPrice() {
        return price;
    }
	
    public void setPrice(Long price) {
        this.price = price;
    }

    @Column(name="width")
    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    @Column(name="length")
    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }
}