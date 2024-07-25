package com.sky.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Slf4j
public class MyTask {

    //@Scheduled(cron = "0/3 * * * * *")
    public void taskTest(){
        log.info("定时任务开始执行：{}",new Date());
    }
}
