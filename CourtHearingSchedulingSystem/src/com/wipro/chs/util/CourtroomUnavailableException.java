package com.wipro.chs.util;

public class CourtroomUnavailableException extends Exception {
    @Override
    public String toString() {
        return "CourtroomUnavailableException:Courtroom is already booked";
    }
}
