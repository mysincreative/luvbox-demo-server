package service.uploadPhoto;

import dto.uploadPhoto.uploadPhotoData;

import java.io.InputStream;

/**
 * Created by m00246-quyen on 10/13/15.
 */
public interface uploadPhotoService {
    public String uploadPhotoService(InputStream file, String filename) throws Exception;
}
