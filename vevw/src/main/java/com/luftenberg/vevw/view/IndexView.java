package com.luftenberg.vevw.view;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.luftenberg.vevw.Service.SomeEntityService;
import com.luftenberg.vevw.model.SomeEntity;


@Component
public class IndexView {

	@Autowired
	private SomeEntityService someEntityService;
	
	@PostConstruct
	public void init() {
		SomeEntity e = new SomeEntity();
		e.setSomeValue("thiiiss value");
		someEntityService.save(e);

		e = new SomeEntity();
		e.setSomeValue("another value");
		someEntityService.save(e);
	}
	
	public List<SomeEntity> getEntities(){
		return someEntityService.findAll();
	}
	
	
}
