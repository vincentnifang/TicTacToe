package com.BIX.homework;

/**
 * @author Vincent
 */
public enum Code {
    /**
     * invalid input
     */
    INVALID_INPUT("300", "invalid input"),
    /**
     * out of bounds
     */
    OUT_OF_BOUNDS("301","input is out of bounds"),
    /**
     * tic already
     */
    TIC_ALREADY("303", "position has been tic before"),
    /**
     * tic ok
     */
    TIC_SUCCESS("000", "tic ok");


    private String code;
    private String message;
    Code(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
