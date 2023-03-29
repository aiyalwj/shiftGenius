package com.lwj.schedule.Schedule.智能排班系统.遗传算法;



import java.util.*;

/**
 * 单独的染色体类
 */

public class Chromo {
    public ArrayList<Integer> chromo= new ArrayList<>();//需要set染色体长度
    public int len=28;
    public Chromo(){
        Random r = new Random();
        for(int i=0;i<len;i++) {
            chromo.add((Integer) (0));//全都没有，靠突变
        }
    }

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }


}
