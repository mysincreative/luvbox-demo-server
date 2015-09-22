package dao;

import javax.persistence.*;
import java.sql.Timestamp;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 11/30/13
 * Time: 5:39 PM
 * To change this template use File | Settings | File Templates.
 */
@Entity(name = "tb_request_log")
public class TbRequestLog {
  private Integer id;
  private  TbRequest request;
  private String log;
  private Timestamp logTime;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "requestId")
    public TbRequest getRequest() {
        return request;
    }

    public void setRequest(TbRequest request) {
        this.request = request;
    }

    @Column(name = "log")
    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    @Column(name = "logTime")
    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }
}
