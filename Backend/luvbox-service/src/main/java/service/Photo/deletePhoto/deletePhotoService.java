package service.photo.deletePhoto;

/**
 * Created by m00246-quyen on 10/28/15.
 */
public interface deletePhotoService {
    /**
     * Delete the photo
     *  Type:
     *      - Hard delete: Can't recover (analyzing maybe download then delete or not download but delete)
     *      - Soft delete: Can recover from recover area (analyzing)
     * @return Result
     */
    public String excute();
}
