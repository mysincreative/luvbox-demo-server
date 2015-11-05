package service.photo.uploadPhoto;

import java.io.InputStream;

/**
 * Created by m00246-quyen on 10/13/15.
 */
public interface uploadPhotoService {
    /**
     * Post photo
     *      Testing: return success or failed string
     *      Release: analyzing
     * @param file
     * @param filename
     * @throws Exception
     * @return ResultString
     */
    public String execute(InputStream file, String filename) throws Exception;
}
