package com.clesun.web.skyland.task;

public class GetTaskClass {
    public static BaseJob getClass(String className) throws Exception {
        Class<?> m_class = Class.forName(className);
        return (BaseJob)m_class.newInstance();
    }
}
