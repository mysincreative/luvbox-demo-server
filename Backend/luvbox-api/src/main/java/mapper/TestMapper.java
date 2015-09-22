package mapper;

import dto.Test;
import dto.TestResult;

/**
 * Created by haminhthanh on 9/23/15.
 */
public class TestMapper {
    /**
     * Mapper Function
     * @param test
     * @return
     */
    public TestResult toTestResult(Test test){
        TestResult result = new TestResult();
        result.setAbc(test.getAbc());
        result.setDef(test.getKey());
        return result;
    }
}
