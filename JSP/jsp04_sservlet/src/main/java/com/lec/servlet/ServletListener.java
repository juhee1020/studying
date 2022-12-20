package com.lec.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletListener implements ServletContextListener{ // 중요~
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// 개발자가 초기화 하고 싶은 로직 구현
		ServletContextListener.super.contextInitialized(sce);
	}
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// Listener가 종료될 때 개발자가 구현할 로직을 작성
		ServletContextListener.super.contextDestroyed(sce);
	}
}