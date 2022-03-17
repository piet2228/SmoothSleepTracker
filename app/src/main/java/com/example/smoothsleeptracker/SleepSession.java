package com.example.smoothsleeptracker;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 * Stores sleep data
 */
public class SleepSession {
    LocalDateTime _start;
    LocalDateTime _end;
    ArrayList<LocalTime> _interruptions;

    public SleepSession(LocalDateTime start) {
        this._start = start;
        _end = start;
        _interruptions = new ArrayList<>();
    }

    public LocalDateTime getStart() {
        return _start;
    }

    public void setStart(LocalDateTime start) {
        this._start = start;
    }

    public LocalDateTime getEnd() {
        return _end;
    }

    public void setEnd(LocalDateTime end) {
        this._end = end;
    }
    public void addInterruption(LocalTime t){
        _interruptions.add(t);
    }

}
