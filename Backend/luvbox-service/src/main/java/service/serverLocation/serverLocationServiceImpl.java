package service.serverLocation;

import Data.otherData.userData;
import core.constant.common.storeLocationType;
/**
 * Created by m00246-quyen on 10/19/15.
 */
public class serverLocationServiceImpl implements serverLocationService {

    /**
     * Create Location execute
     * @param type
     * @param userData
     * @return Location String
     */
    public String execute(storeLocationType type, userData userData){
        String locationStr = null;
        switch (type){
            case COUPLE_PHOTO_URL: {
                locationStr = "";
                break;
            }
            case PRIVATE_PHOTO_URL:
                break;
            case OTHER_FILE_URL:
                break;
            default:
                break;
        }
        return locationStr;
    }


}
