package com.xxxx.springsecuritydemo.enums;

public enum OrderStatus {
    Finish(0,"完成"),
    WaitPay(1,"待付款"),
    PayCheck(2,"付款確認中"),
    PayOk(3,"付款完成"),
    Processing(4,"商品處理中"),
    Send(5,"商品已寄出"),
    Cancel(9,"取消");


    OrderStatus(int key, String chinese){
        this.key = key;
        this.chinese = chinese;
    }

    private final int key;
    private final String chinese;

    public static OrderStatus getOrderStatus(int i){

        switch(i){
            case 0: return Cancel;
            case 1: return WaitPay;
            case 2: return PayCheck;
            case 3: return PayOk;
            case 4: return Processing;
            case 5: return Send;
            case 9: return Finish;
            default: return null;
        }

    }

    public int getKey(){
        return this.key;
    }

    public String getChinese(){
        return this.chinese;
    }
}
