package com.clesun.auth.clesunauthsystem_v2;

import com.alibaba.fastjson.JSON;
import com.clesun.web.skyland.dto.ResultEntity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.*;

@SuppressWarnings("ALL")
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(locations = {"classpath*:quartz.xml"})
@WebAppConfiguration
public class ClesunauthsystemV2ApplicationTests {

    @Autowired
	private WebApplicationContext webContext;

    private MockMvc mockMvc;

    @Before
    public void setupMockMvc(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
    }

	@Test
	public void contextLoads() {

	}





    @Test
    public void quartzTest(){
		ApplicationContext context =
				new ClassPathXmlApplicationContext("quartz.xml");
		Scheduler a = (Scheduler) context.getBean("schedulerFactoryBean");
		try {
			a.start();
		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}

    @Test
    public void errorPageTest(){
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/error"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.view().name("error"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ResultEntityTest(){
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        //测试构造函数
		ResultEntity resultEntity = new ResultEntity();
        System.out.println(resultEntity.toString());

        //设置数据
        resultEntity.setCode(500);
        resultEntity.setMsg("未知错误，请联系管理员");
        HashMap<String,Object> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        list.add("hello world");
        list.add("hello my love");
        map.put("hello",list);
        map.put("hello2","nihaoma");
        resultEntity.setData(map);
        resultEntity.setDatasize(map.size());
        System.out.println(resultEntity.toString());
        System.out.println("==================================");
        System.out.println(JSON.toJSONString(resultEntity));

    }


}
