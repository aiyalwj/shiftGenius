package com.lwj.schedule.Schedule.智能排班系统;
import com.lwj.schedule.Schedule.智能排班系统.遗传算法.Chromo;
import com.lwj.schedule.Schedule.智能排班系统.遗传算法.GA_group;
import com.lwj.schedule.entity.EmployeeSchedule;

import java.sql.SQLOutput;
import java.sql.Timestamp;
import java.util.*;
public class pb {
    public static void main(String[] args) {

        ArrayList<ArrayList<Double>> Premodel;
        ArrayList<EmployeeSchedule> Stuffs;
        Timestamp start_time;

        System.out.println("智能排班系统欢迎你！");
        Scanner sc = new Scanner(System.in);
        //stuff_arr员工集合

        /**
         * 偏好输入规则：
         *
         * 工作日偏好 1、3、4、5、7
         * 工作时间偏好 9:30-21:30 9:00-21:00
         * 日工作时间偏好 6小时
         * 无偏好，正常工作
         */

//        下面是和员工有关的操作
//       放到mapper里且把name和Stuff对应上
//        先初始化HashMap
        HashMap<String, EmployeeSchedule> stuff_arr = new HashMap<>();
//        //Stuff a = new Stuff("张三", "店长", "173028", "qq.com", "1", "工作日偏好 1、3、4、5、6");
//        //Stuff a = new Stuff("张三", "店长", "173028", "qq.com", "1", "工作时间偏好 12:00-18:00");
//        Stuff a = new Stuff("张三", "店长", "173028", "qq.com", "1", "日工作时间偏好 7小时");
//        Stuff b = new Stuff("李四", "经理", "173029", "weixin.com", "1", "工作日偏好 1、3、4、5、6");
//        Stuff c = new Stuff("王五", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff d = new Stuff("老六", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff e = new Stuff("田七", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff f = new Stuff("丈八", "经理", "173029", "weixin.com", "1", "工作日偏好 1、3、4、5、6");
//        Stuff g = new Stuff("小松", "经理", "173029", "weixin.com", "1", "工作日偏好 1、2、5、6");
//        Stuff h = new Stuff("小美", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff i = new Stuff("金发妹", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff j = new Stuff("哈哈", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff k = new Stuff("12", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff l = new Stuff("23", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");
//        Stuff m = new Stuff("34", "经理", "173029", "weixin.com", "1", "工作时间偏好 10:30-21:00");
//        Stuff n = new Stuff("45", "经理", "173029", "weixin.com", "1", "工作时间偏好 12:00-19:30");
//        Stuff o = new Stuff("56", "经理", "173029", "weixin.com", "1", "无偏好，正常工作");


//        for()
//        stuff_arr.put(a.getName(),a);
//        stuff_arr.put(b.getName(),b);
//        stuff_arr.put(c.getName(),c);
//        stuff_arr.put(d.getName(),d);
//        stuff_arr.put(e.getName(),e);
//        stuff_arr.put(f.getName(),f);
//        stuff_arr.put(g.getName(),g);
//        stuff_arr.put(h.getName(),h);
//        stuff_arr.put(i.getName(),i);
//        stuff_arr.put(j.getName(),j);
//        stuff_arr.put(k.getName(),k);
//        stuff_arr.put(l.getName(),l);
//        stuff_arr.put(m.getName(),m);
//        stuff_arr.put(n.getName(),n);
//        stuff_arr.put(o.getName(),o);

        //打印显示包含了所有员工的集合Map
//        StuffOperator.allStuffInformation(stuff_arr);

        //        下面是和店有关的操作
////                初始化
//        HashMap<String,Store> store_arr = StoreOperator.store_arrInit();
//        Store store1 = new Store("1","张家界",100.0,stuff_arr);
//        store_arr.put(store1.getName(),store1);
//        //显示店集
//        StoreOperator.allStoreInformation(store_arr);
        //已存在店、员工
        //员工染色体已自动初始化

        /**
         * 需要排班的天数，这里只是为了获取是星期几
         */

//        上面的代码都是在做初始化，初始化很多员工，初始化一个门店

//        store1.use_GA(1);//哪天
//        int DAY1=7;//
//        for(int day=1;day<=DAY1;day++)
//        {
//            store1.use_GA(day);//哪天
//        }

        //用的是一天来排的班

//        StoreOperator.store_add(store_arr);//add出问题
//        int DAY2=30;
//        for(int day=1;day<=DAY2;day++)
//        {
//            store_arr.get("1").use_GA(day);
//        }

    }
}




