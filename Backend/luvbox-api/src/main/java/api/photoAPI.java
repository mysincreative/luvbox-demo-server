package api;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.InputStream;
import service.photo.uploadPhoto.uploadPhotoService;

/**
 * Created by m00246-quyen on 10/21/15.
 */
@Component
@Path("/luvboxTest/photo")
public class photoAPI {

    @Autowired
    private uploadPhotoService uploadPhotoService;
    /**
     * Upload photo
     * @return Response
     */
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Path("/Upload")
    public Response Upload( @FormDataParam("file") InputStream uploadedInputStream,
                            @FormDataParam("file") FormDataContentDisposition fileDetail) throws Exception{
        String uploadStatus = uploadPhotoService.execute(uploadedInputStream, fileDetail.getName());
        return Response.status(200).entity(uploadStatus).build();
    }

    @POST
    @Path("/Download")
    public Response Download(){
        return Response.status(200).build();
    }

}
