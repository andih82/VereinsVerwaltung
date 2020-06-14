package com.luftenberg.vevw.Service;

import java.util.List;

import com.luftenberg.vevw.model.SomeEntity;

public interface SomeEntityService {
	
	public void save(SomeEntity entity);
	
	public List<SomeEntity> findAll();
	
}
