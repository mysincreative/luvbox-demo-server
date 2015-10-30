package dto.uploadPhoto;

/**
 * Created by m00246-quyen on 10/30/15.
 */
public class postPhotoDto extends uploadPhotoDto {
    //Photo Capture
    private String photoCapture;

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
