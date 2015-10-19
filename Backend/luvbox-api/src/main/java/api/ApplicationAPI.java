package api;


import java.io.InputStream;
import java.util.*;

import javax.ws.rs.*;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import dto.*;
import mapper.TestMapper;
import org.springframework.stereotype.Component;
import message.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import service.uploadPhoto.uploadPhotoService;

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

    @POST
    @Path("/photo")
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response phototest(
            @FormDataParam("file") InputStream uploadedInputStream,
            @FormDataParam("file") FormDataContentDisposition fileDetail) throws Exception{
        String uploadStatus = uploadPhotoService.uploadPhotoService(uploadedInputStream, fileDetail.getName());
        String a = fileDetail.getType();
        return Response.status(200).entity(uploadStatus).build();
    }

}