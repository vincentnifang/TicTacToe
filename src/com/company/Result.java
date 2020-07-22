package com.company;

/**
 * @author Vincent
 */
public class Result {

    boolean isWin;
    Code code;

    Result(Code code) {
        this.code = code;
    }

    Result(Code code, boolean isWin) {
        this.code = code;
        this.isWin = isWin;
    }
}
