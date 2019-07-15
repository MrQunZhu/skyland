package com.clesun.web.skyland.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebContextListener implements HttpSessionListener,ServletRequestListener,ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听器证正在起作用："+sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("context结束");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("监听器证正在起作用："+se.getSession().toString());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("会话销毁");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("请求结束");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("请求监听器证正在起作用："+sre.getServletRequest().getRemoteHost());
    }
}
