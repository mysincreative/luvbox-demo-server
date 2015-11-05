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
    private final codeType _type;

    /** Code*/
    private final Integer _code;

    /** processing package message*/
    private final String _mess;

    /** Call service Path*/
    private final String _svPath;

    /**
     * Constructor
     */
    private resultCode(codeType t, Integer c, String _mess, String _svPath){
        this._type = t;
        this._code = c;
        this._mess = _mess;
        this._svPath = _svPath;
    }

    /**
     * Get Result Code Type {Normal, Error, Warning, Information}
     * @return _type
     */
    public codeType get_type(){
        return _type;
    }

    /**
     * Get Result Code
     * @return _code * _type
     * if OK passed => _code = 0
     * if error => _code = _code
     * warning and information => _code = -_code
     */
    public Integer get_code(){
        return _code * _type.getCode();
    }


    /**
     * Return Code message (error package information)
     * @return _mess
     */
    public String get_mess(){
        return _mess;
    }

    /**
     * Return Call service
     * @return _svPath
     */
    public String get_svPath(){
        return _svPath;
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
