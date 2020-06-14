package com.luftenberg.vevw.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luftenberg.vevw.model.SomeEntity;
import com.luftenberg.vevw.repository.SomeEntityRepository;

@Service
public class SomeEntityServiceImpl implements SomeEntityService {

	@Autowired
	private SomeEntityRepository someEntityRepo;
	
	@Override
	public void save(SomeEntity entity) {

		someEntityRepo.saveAndFlush(entity);
	}

	@Override
	public List<SomeEntity> findAll() {
		return someEntityRepo.findAll();
	}

}
