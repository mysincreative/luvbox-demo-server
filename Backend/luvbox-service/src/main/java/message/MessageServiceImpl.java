package message;

import dto.Test;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by haminhthanh on 9/20/15.
 */
public class MessageServiceImpl implements MessageService {
    public Test testService() {

        Test test = new Test();
        test.setAbc("abc");
        test.setKey("def");
        test.setName("ghk");


       return test;
    }
}
