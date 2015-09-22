package api;


import java.util.*;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import dto.*;
import mapper.TestMapper;
import org.springframework.stereotype.Component;
import message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

@Component
@Path("/luvbox")
public class ApplicationAPI {

    @Autowired
    private MessageService messageService;

    @Autowired
    private TestMapper testMapper;

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {

        Test tmp = messageService.testService();
        TestResult result = testMapper.toTestResult(tmp);
        return Response.status(200).entity(result).build();

    }

}