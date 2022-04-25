package com.onex.crmx.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

import com.onex.crmx.interfacews.IBaseService;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class BaseWs<T extends IBaseService<?>> {
  
	@Autowired
	public T service;
	
}
