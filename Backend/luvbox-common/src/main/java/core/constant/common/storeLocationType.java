package core.constant.common;

/**
 * Created by m00246-quyen on 11/5/15.
 */
public enum storeLocationType {

    COUPLE_PHOTO_URL(1),
    PRIVATE_PHOTO_URL(2),
    COUPLE_UI_URL(3),
    OTHER_FILE_URL(4);

    /** Upload file type */
//    private final String typeName;
    /** Type's Value*/
    private final Integer value;

    /**
     * Constructor
     */
    private storeLocationType(Integer value){
//        this.typeName = typeName;
        this.value = value;
    }

//    /**
//     * Type name
//     * @return typeName
//     */
//    public String getTypeName() {
//        return typeName;
//    }

    /**
     * get type Value
     * @return value
     */
    public Integer getValue() {
        return value;
    }

    /**
     * get location type
     * @param val
     * @return obj (location type)
     */
    public static storeLocationType ofSafe(Integer val){
        for (storeLocationType obj : storeLocationType.values()){
            if (obj.value.equals(val))
                return obj;
        }
        return null;
    }
}
