package Data.photoData;

/**
 * Created by m00246-quyen on 10/30/15.
 */
public class postPhotoData extends uploadPhotoData {
    //Photo Capture
    private String photoCapture;
    //User emotion icon analyzing
    //private String emoCode;

    /**
     * Photo Capture getter
     * @return photoCapture
     */
    public String getPhotoCapture() {
        return photoCapture;
    }

    /**
     * Photo Capture setter
     * @param photoCapture
     */
    public void setPhotoCapture(String photoCapture) {
        this.photoCapture = photoCapture;
    }

}
