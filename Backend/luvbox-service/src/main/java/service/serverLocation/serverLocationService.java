package service.serverLocation;

import Data.otherData.userData;
import core.constant.common.storeLocationType;

/**
 * Created by m00246-quyen on 10/19/15.
 */
public interface serverLocationService {
    /**
     * Create Store location on server
     * @return
     */
    public String execute(storeLocationType type, userData userData);
}
