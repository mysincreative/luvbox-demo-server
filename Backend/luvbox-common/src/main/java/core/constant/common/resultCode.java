package core.constant.common;

/**
 * Created by m00246-quyen on 10/19/15.
 * Application ResultCode
 */
public enum resultCode {

    /** Normal Passed */
    OK(codeType.OK, 0, "", null),

    /** other error*/
    ERR_OTHER(codeType.ERR, 1, "error.other","");


    /** Code Type*/
    private final codeType type;

    /** Code*/
    private final Integer code;

    /** processing package message*/
    private final String mess;

    /** Call service Path*/
    private final String svPath;

    /**
     * Constructor
     */
    private resultCode(codeType t, Integer c, String mess, String svPath ){
        this.type = t;
        this.code = c;
        this.mess = mess;
        this.svPath = svPath;
    }

    /**
     * Get Result Code Type {Normal, Error, Warning, Information}
     * @return type
     */
    public codeType getType(){
        return type;
    }

    /**
     * Get Result Code
     * @return code * type
     * if OK passed => code = 0
     * if error => code = code
     * warning and information => code = -code
     */
    public Integer getCode(){
        return code * type.getCode();
    }


    /**
     * Return Code message (error package information)
     * @return mess
     */
    public String getMess(){
        return mess;
    }

    /**
     * Return Call service
     * @return svPath
     */
    public String getSvPath(){
        return svPath;
    }

    /**
     * Result Code Type
     */
    public static enum codeType {

        /** Process Passed */
        OK(0),

        /** Error */
        ERR(1),

        /** Warning*/
        WARN(-1),

        /** Information */
        INFO(-1);

        /**
         * Result Code Type
         */
        private final Integer codeType;

        /**
         * Constructor
         * @param cdType
         */
        private codeType(Integer cdType){
            this.codeType = cdType;
        }

        /**
         * get Result Code
         * @return
         */
        public Integer getCode(){
            return this.codeType;
        }

    }
}
