package io.github.kingschan1204.istock.module.spider.schedule;

import io.github.kingschan1204.istock.common.util.spring.SpringContextUtil;
import io.github.kingschan1204.istock.module.spider.util.TradingDateUtil;
import lombok.extern.slf4j.Slf4j;
import java.time.LocalDateTime;

/**
 * 调度作业
 *
 * @author chenguoxiang
 * @create 2019-03-26 17:00
 **/
@Slf4j
public class ScheduleThread implements Runnable {

    @Override
    public void run() {
        LocalDateTime dateTime = LocalDateTime.now();
        TradingDateUtil tradingDateUtil = SpringContextUtil.getBean(TradingDateUtil.class);

        switch (dateTime.getHour()) {
            case 0:
                //晚上12点
                break;
            case 9:
                //早上9点
                break;
            case 11:
                //上午11点
                break;
            case 13:
                //下午1点
                break;
            case 15:
                //下午3点
                break;
            default:
                break;
        }


    }

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime.getHour());
    }

}