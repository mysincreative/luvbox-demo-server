package dao;

import dto.UserRole;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * TbUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tb_user" , uniqueConstraints = @UniqueConstraint(columnNames = "loginId"))
public class TbUser implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String loginId;
	private String password;
	private UserRole role;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private String address;
	private Boolean isActive;
	private String createTime;
	private String lastUpdateTime;
	private List<TbRequest> tbRequests = new ArrayList<TbRequest>(0);
    private List<TbMessage> tbMessages = new ArrayList<TbMessage>(0);
    private List<TbRequest> requestInCharges = new ArrayList<TbRequest>(0);
    private List<TbRequestMessage> tbRequestMessages = new ArrayList<TbRequestMessage>(0);
	private List<TbRequestAttachment> tbRequestAttachments = new ArrayList<TbRequestAttachment>(0);

	// Constructors

	/** default constructor */
	public TbUser() {
	}

	/** full constructor */
	public TbUser(String loginId, String password, UserRole role,
			String firstName, String lastName, String email,
			String phoneNumber, String address, Boolean isActive,
			String createTime, String lastUpdateTime,
			List<TbRequest> tbRequests, List<TbRequestTemplate> tbUsertemplates) {
		this.loginId = loginId;
		this.password = password;
		this.role = role;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.isActive = isActive;
		this.createTime = createTime;
		this.lastUpdateTime = lastUpdateTime;
		this.tbRequests = tbRequests;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "uid", unique = true, nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "loginId", unique = true, length = 45)
	public String getLoginId() {
		return this.loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	@Column(name = "password", length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "role")
    @Enumerated(EnumType.STRING)
	public UserRole getRole() {
		return this.role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	@Column(name = "firstName", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "phoneNumber", length = 45)
	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "isActive")
	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name = "createTime", length = 45)
	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	@Column(name = "lastUpdateTime", length = 45)
	public String getLastUpdateTime() {
		return this.lastUpdateTime;
	}

	public void setLastUpdateTime(String lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbUser")
	public List<TbRequest> getTbRequests() {
		return this.tbRequests;
	}

	public void setTbRequests(List<TbRequest> tbRequests) {
		this.tbRequests = tbRequests;
	}


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "tbUser")
    public List<TbMessage> getTbMessages() {
        return tbMessages;
    }

    public void setTbMessages(List<TbMessage> tbMessages) {
        this.tbMessages = tbMessages;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "personInCharge")
    public List<TbRequest> getRequestInCharges() {
        return requestInCharges;
    }

    public void setRequestInCharges(List<TbRequest> requestInCharges) {
        this.requestInCharges = requestInCharges;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "fromUser")
    public List<TbRequestMessage> getTbRequestMessages() {
        return tbRequestMessages;
    }

    public void setTbRequestMessages(List<TbRequestMessage> tbRequestMessages) {
        this.tbRequestMessages = tbRequestMessages;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "uploadBy")
    public List<TbRequestAttachment> getTbRequestAttachments() {
        return tbRequestAttachments;
    }

    public void setTbRequestAttachments(List<TbRequestAttachment> tbRequestAttachments) {
        this.tbRequestAttachments = tbRequestAttachments;
    }
}