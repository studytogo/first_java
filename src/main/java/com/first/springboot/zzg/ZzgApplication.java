package com.first.springboot.zzg;

import com.first.springboot.zzg.Service.AsyncTaskService;
import com.first.springboot.zzg.ThreadDemo.TaskExecutePool;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class ZzgApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZzgApplication.class, args);
//        System.out.println("111111111111");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutePool.class);
//        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
//        for (int i = 0; i < 10; i++) {
//            asyncTaskService.executeAsyncTask(i);
//            asyncTaskService.executeAsyncTaskPlus(i);
//        }
//        context.close();
    }

}
