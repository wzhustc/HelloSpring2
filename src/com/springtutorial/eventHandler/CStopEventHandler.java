package com.springtutorial.eventHandler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class CStopEventHandler 
			implements ApplicationListener<ContextStoppedEvent>{
	
	@Override
	public void onApplicationEvent(ContextStoppedEvent arg0) {
		System.out.println("停止事件处理器被调动！");
	}

}
