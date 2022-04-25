package com.onex.crmx.ws;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onex.crmx.entity.Account;
import com.onex.crmx.exception.BaseServiceException;
import com.onex.crmx.interfacews.IAccountService;

@RestController
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class AccountWs extends BaseWs<IAccountService<Account>>{
	
	@RequestMapping(value = "/account" , method = RequestMethod.GET)
	@ResponseBody
	List<Account> getAccounts() throws BaseServiceException{
		return service.getAll();
	}
	
	@RequestMapping(value = "/account/{id}" , method = RequestMethod.GET )
	@ResponseBody
	Object getAccount(@PathVariable("id") Long id) {
		return service.getObject(id);
	}
	
	@RequestMapping(value = "/account" , method = RequestMethod.POST)
	Account saveAccount(@RequestBody Account account) {
		return service.save(account);
	}
	
	@RequestMapping(value = "/account/savebatch", method = RequestMethod.POST)
	@ResponseBody
	List<Account> saveAccounts(@RequestBody List<Account> list){
		return service.saveAll(list);
	}
	
	@RequestMapping(value = "/account" , method = RequestMethod.DELETE)
	@ResponseBody
	boolean deleteAccount(@RequestBody Account account) {
		return service.delete(account);
	}
	
	@RequestMapping(value = "/account/deletebatch" , method = RequestMethod.DELETE)
	@ResponseBody
	boolean deleteAccounts(@RequestBody List<Account> list) {
		return service.deleteAll(list);
	}
}
