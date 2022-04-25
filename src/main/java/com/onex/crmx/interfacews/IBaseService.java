package com.onex.crmx.interfacews;

import java.util.List;

public interface IBaseService<T> {

	public List<T> getAll();
	public Object getObject(Long id);
	public T save(T object);
	public List<T> saveAll(List<T> list);
	public boolean delete(T object);
	public boolean deleteAll(List<T> list);
	
}
