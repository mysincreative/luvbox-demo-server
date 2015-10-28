package api;

import org.springframework.stereotype.Component;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by m00246-quyen on 10/21/15.
 */
@Component
@Path("/luvbox/photo")
public class photoAPI {


    /**
     * Upload photo
     * @return Response
     */
    @Path("/Upload")
    public Response Upload(){
        return Response.status(200).build();
    }

    @Path("/Download")
    public Response Download(){
        return Response.status(200).build();
    }

}
