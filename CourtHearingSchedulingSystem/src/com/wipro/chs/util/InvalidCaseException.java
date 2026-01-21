package com.wipro.chs.util;

public class InvalidCaseException extends Exception {
    @Override
    public String toString() {
        return "InvalidCaseException:Case ID does not exist";
    }
}
