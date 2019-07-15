package com.clesun.web.skyland.task;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

@Configuration
public class SchedulerListener implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {
//            System.out.println("启动监听器==============");
//            ApplicationContext context =
//                    new ClassPathXmlApplicationContext("quartz.xml");
//            org.quartz.Scheduler a = (org.quartz.Scheduler) context.getBean("schedulerFactoryBean");
//            a.start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /*@Bean
    public SchedulerFactoryBean schedulerFactoryBean(){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        return schedulerFactoryBean;
    }*/
}
