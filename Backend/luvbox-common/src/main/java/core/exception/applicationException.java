package core.exception;

import core.constant.common.resultCode;

/**
 * Created by m00246-quyen on 10/19/15.
 * Aplication Throw Exception
 */
public class applicationException extends Exception {

    //Exception result Code
    private resultCode code = null;

    //Constructor basic
    public applicationException(resultCode c){
        this.code = c;
    }

    /**
    * Constructor Code with throw message error
    * @param c ErrorCode
    * @param mess Error Message
    */
    public applicationException(resultCode c, String mess){
        super(mess, (Throwable) null);
        this.code = c;
    }

    /**
     * Constructor with Set error code and throw error detail
     * @param c Error code
     * @param t Throwable detail
     */
    public applicationException(resultCode c, Throwable t){
        super(null, t);
        this.code = c;
    }

    /**
     * Constructor with throw message and error detail
     * @param c resultCode
     * @param mess message
     * @param t throwable
     */
    public applicationException(resultCode c, String mess, Throwable t){
        super(mess, t);
        this.code = c;
    }

    /**
    * Get Result Code
    */
    public resultCode getCode(){
        return this.code;
    }

}
