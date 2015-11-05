package core.constant.common.photoUIType;

import com.sun.istack.internal.Nullable;

/**
 * Created by m00246-quyen on 11/5/15.
 */
public enum UIType {
    /** Cover Photo */
    COVER_PHOTO("cover", 1),

    /** Profile Photo */
    PROFILE_PHOTO("profile", 2),

    /** Theme Photo
     * This will be implement later because this is couple background photo
     */
    THEME_PHOTO("theme", 3);

    private final String UITypeStr;

    private final Integer value;

    private UIType(String UITypeStr, Integer value){
        this.UITypeStr = UITypeStr;
        this.value = value;
    }

    public String getUITypeStr() {
        return UITypeStr;
    }

    public Integer getValue() {
        return value;
    }
    
    public static UIType ofSafe(Integer type){
        for (UIType obj : UIType.values()){
            if (obj.value.equals(type))
                return obj;
        }
        return null;
    }
}
