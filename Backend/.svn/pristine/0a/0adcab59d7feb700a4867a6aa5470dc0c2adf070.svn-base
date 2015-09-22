package entity;

import dto.Status;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

public class UserRequest {

	private String id;
	private String message;
	private UserEntity user;

    @Enumerated(EnumType.STRING)
	private Status status;
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public UserEntity getUser() {
		return user;
	}
	public void setUser(UserEntity user) {
		this.user = user;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
