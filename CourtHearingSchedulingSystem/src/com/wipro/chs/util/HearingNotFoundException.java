package com.wipro.chs.util;

public class HearingNotFoundException extends Exception {
    @Override
    public String toString() {
        return "HearingNotFoundException:Hearing ID not found";
    }
}
