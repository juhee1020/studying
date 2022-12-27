package com.lec.basic.collection;

import java.util.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanMain {
	public static void main(String[] args) {

		AbstractApplicationContext factory = new  GenericXmlApplicationContext("collectionContext.xml");
		CollectionBean bean=(CollectionBean)factory.getBean("collectionBean");

		List<String> addList=bean.getAddressList();

		for(String list:addList) {
			System.out.println("List > > "+list.toString());
		}

		Set<String> addSet=bean.getAddressSet();
		for(String list:addSet) {
			System.out.println("Set > > "+list.toString());
			// 경기도 신한카드 1,2 두개만 나옴. (중복x)
		}

		Map<String, String> addMap=bean.getAddMap();
		
		Properties props=bean.getAddProps();

		// 맴이랑 프로퍼티스는 돌려서 뽑아보든가...
		
		factory.close();
	}
}