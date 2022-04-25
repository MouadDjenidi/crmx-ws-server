package com.onex.crmx.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.onex.crmx.entity.Account;
import com.onex.crmx.interfacews.IAccountService;
import com.onex.crmx.repository.AccountRepository;

@Service
@Scope (BeanDefinition.SCOPE_PROTOTYPE)
public class AccountService implements IAccountService<Account> {
    
	@Autowired
	public AccountRepository repository;

	@Override
	public List<Account> getAll() {
		return repository.findAll();
	}

	@Override
	public Object getObject(Long id) {
		try {
			Object account = repository.findById(id);
			return  account;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Account save(Account Object) {
		try {
			Object = repository.save(Object);
			return Object;
		} catch (Exception e) {
		   e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Account> saveAll(List<Account> list) {
		try {
			list = repository.saveAll(list);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return null;
		
	}

	@Override
	public boolean delete(Account object) {
		try {
			repository.delete(object);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteAll(List<Account> list) {
		try {
		   repository.deleteInBatch(list);
		   return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}


}
