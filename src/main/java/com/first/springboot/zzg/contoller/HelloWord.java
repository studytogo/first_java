package com.first.springboot.zzg.contoller;

import com.first.springboot.zzg.Config.TestConfig;
import com.first.springboot.zzg.Dao.TestUserDao;
import com.first.springboot.zzg.Entry.TestUser;
import com.first.springboot.zzg.Service.HelloWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloWord {

    @Autowired
    private HelloWordService h;

    @Autowired
    private TestConfig config;

    @Autowired
    private TestUserDao dao;

    @RequestMapping("/hello")
    public String SayHello() {
        //KafkaProducerDemo demo = new KafkaProducerDemo();
        //demo.produceMessage();
        //String msg = h.sayHello();
//        System.out.println("111111111111");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutePool.class);
//        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
//        for (int i = 0; i < 10; i++) {
//            asyncTaskService.executeAsyncTask(i);
//            asyncTaskService.executeAsyncTaskPlus(i);
//        }
//        context.close();
           TestUser user = new TestUser();
           user.setName("zzg");
           String msg = config.getMesssage();
        return msg;
    }
}
