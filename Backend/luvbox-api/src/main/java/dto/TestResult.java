package dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by haminhthanh on 9/23/15.
 */
@XmlRootElement
public class TestResult extends CommonResult{
    private String abc;
    private String def;

    public String getAbc() {
        return abc;
    }

    public void setAbc(String abc) {
        this.abc = abc;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }
}
