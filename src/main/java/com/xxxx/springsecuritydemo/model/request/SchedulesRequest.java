package com.xxxx.springsecuritydemo.model.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;
import com.xxxx.springsecuritydemo.enums.RangeTypeEnums;
import com.xxxx.springsecuritydemo.model.TimePeriod;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: SchedulesRequest
 * @date: 2021/9/27
 * @description:
 */
@Data
public class SchedulesRequest {

    @Future(message = "請輸入正確的日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    //DateTimeFormat舊版需要JsonFormat來設定時區，新版@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Taipei")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date startDate;
    @Future(message = "請輸入正確的日期")
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    //DateTimeFormat舊版需要JsonFormat來設定時區，新版有timezone可以設定時區@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ", timezone = "Asia/Taipei")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date endDate;

    @NotNull
    List<TimePeriod> times;

    @NotNull
    int rangeType ;

    @NotNull
    int SchedulesType ;


    List<Integer>  rangeNumber;

//    public void setEndDate(Date endDate) {
////        if(endDate.getTime()>=this.startDate.getTime()){
////
////        }
////        this.endDate = endDate;
//    }

    public void setOpenTime(List<TimePeriod> openTime) {
        this.times = openTime;
    }

    public void setStartDate(Date startDate) {
        System.out.println("startDate:"+startDate);
        this.startDate = startDate;
    }

    public void setCalendarChooseList(List<Integer> calendarChooseList) {

        if(rangeType== RangeTypeEnums.Day.getKey()){
            return;
        }else if(rangeType== RangeTypeEnums.Week.getKey()){
            rangeNumber.stream().distinct().collect(Collectors.toList()).forEach(v->{
                @Min(value = 0, message = "星期設定錯誤")
                @Max(value = 6, message = "星期設定錯誤")
                 int weekDay=v;
            });

        }else if(rangeType== RangeTypeEnums.Month.getKey()){

        }

    }
}
