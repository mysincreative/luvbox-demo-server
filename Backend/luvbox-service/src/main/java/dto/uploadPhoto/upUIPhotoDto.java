package dto.uploadPhoto;

/**
 * Created by m00246-quyen on 11/2/15.
 */
public class upUIPhotoDto extends uploadPhotoDto {
    //Photo UI Type (data type is analyzing)
    private String uiType;

    /**
     * Photo UI Type getter
     * @return uiType
     */
    public String getUiType() {
        return uiType;
    }

    /**
     * Photo UI Type setter
     * @param uiType
     */
    public void setUiType(String uiType) {
        this.uiType = uiType;
    }
}
