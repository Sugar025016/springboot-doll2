package com.xxxx.springsecuritydemo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;

import java.util.Date;

/**
 * @author: TimePeriod
 * @date: 2021/9/27
 * @description:
 */
@Data
@NoArgsConstructor
public class TimePeriod {



//    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    java.sql.Time startTime;

//    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    @NonNull
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    java.sql.Time endTime;



    public void setStartTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {
        this.startTime = new java.sql.Time(date.getTime());
    }

    public void setEndTime(@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date) {

        this.endTime = new java.sql.Time(date.getTime());
    }


}
