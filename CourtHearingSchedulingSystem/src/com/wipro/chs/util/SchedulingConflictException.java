package com.wipro.chs.util;

public class SchedulingConflictException extends Exception {
    @Override
    public String toString() {
        return "SchedulingConflictException:Hearing time overlaps with existing schedule";
    }
}
