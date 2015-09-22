package dao;

import dto.RequestType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 10/8/13
 * Time: 10:40 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity
@Table(name = "tb_message" )
public class TbMessage implements java.io.Serializable {
    // Fields

    private Integer id;
    private TbUser tbUser;
    private Date createTime;
    private String message;
    private Boolean isReaded;

    // Constructors

    /** default constructor */
    public TbMessage() {
    }

    // Property accessors
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "uid")
    public TbUser getTbUser() {
        return this.tbUser;
    }

    public void setTbUser(TbUser tbUser) {
        this.tbUser = tbUser;
    }



    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "createTime", length = 10)
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Column(name = "isReaded")
    public Boolean getIsReaded() {
        return this.isReaded;
    }

    public void setIsReaded(Boolean isReaded) {
        this.isReaded = isReaded;
    }
}
