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
    private final Integer _value;

    /**
     * Constructor
     */
    private storeLocationType(Integer _value){
//        this.typeName = typeName;
        this._value = _value;
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
     * @return _value
     */
    public Integer get_value() {
        return _value;
    }

    /**
     * get location type
     * @param val
     * @return obj (location type)
     */
    public static storeLocationType ofSafe(Integer val){
        for (storeLocationType obj : storeLocationType.values()){
            if (obj._value.equals(val))
                return obj;
        }
        return null;
    }
}
