package com.chengte99.parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Car {
    private String id;
    private LocalDateTime enter;
    private LocalDateTime leave;

    public Car(String id, LocalDateTime enter) {
        this.id = id;
        this.enter = enter;
    }

    public LocalDateTime getLeave() {
        return leave;
    }

    public void setLeave(LocalDateTime leave) {
        if (leave.isAfter(enter)) {
            this.leave = leave;
        }
    }

    public long getDuration() {
        return Duration.between(enter, leave).toMinutes();
    }
}
