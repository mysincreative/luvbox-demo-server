package api;


import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import dto.Test;
import dto.TestResult;
import mapper.TestMapper;
import message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import service.photo.uploadPhoto.uploadPhotoService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;

@Component
@Path("/luvbox")
public class ApplicationAPI {

    @Autowired
    private MessageService messageService;

    @Autowired
    private TestMapper testMapper;

    @Autowired
    private uploadPhotoService uploadPhotoService;

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Response test() {

        Test tmp = messageService.testService();
        TestResult result = testMapper.toTestResult(tmp);
        return Response.status(200).entity(result).build();

    }


}