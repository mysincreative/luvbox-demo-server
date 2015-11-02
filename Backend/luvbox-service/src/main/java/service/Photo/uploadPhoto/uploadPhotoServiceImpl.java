package service.photo.uploadPhoto;

import java.io.*;

/**
 * Created by m00246-quyen on 10/13/15.
 */
public class uploadPhotoServiceImpl implements uploadPhotoService{

    public String excute(InputStream file, String filename) throws Exception{

        //First will set static, after will fix to create location on server
        String serverLocation = "/Users/m00246-quyen/Documents/serverFolder/" + filename + ".png";
        try {
            OutputStream outputStream = new FileOutputStream(serverLocation);
            int read = 0;
            byte[] bytes = new byte[1024];

            outputStream = new FileOutputStream(new File(serverLocation));
            while ((read = file.read(bytes)) != -1) {
                outputStream.write(bytes, 0, read);
            }
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            return "failed";
        }
        return "Success";
    }
}
