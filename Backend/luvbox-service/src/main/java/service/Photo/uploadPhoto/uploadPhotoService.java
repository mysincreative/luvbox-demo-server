package service.photo.uploadPhoto;

import java.io.InputStream;

/**
 * Created by m00246-quyen on 10/13/15.
 */
public interface uploadPhotoService {
    /**
     * (Memo) Testing for upload photo, after that will no more use this
     * @param file
     * @param filename
     * @return
     * @throws Exception
     */
    public String uploadPhotoService(InputStream file, String filename) throws Exception;

    /**
     * Post photo
     *      Testing: return success or failed string
     *      Release: analyzing
     * @return ResultString
     */
    public String excute();
}
