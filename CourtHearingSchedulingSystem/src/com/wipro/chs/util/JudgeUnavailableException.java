package com.wipro.chs.util;

public class JudgeUnavailableException extends Exception {
    @Override
    public String toString() {
        return "JudgeUnavailableException:Judge is already booked for this time slot";
    }
}
