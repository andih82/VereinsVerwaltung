package com.luftenberg.vevw.Service;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.luftenberg.vevw.VereinsVerwaltungApplication;
import com.luftenberg.vevw.VereinsVerwaltungApplicationTests;
import com.luftenberg.vevw.model.SomeEntity;


class SomeEntityServiceImplTest extends VereinsVerwaltungApplicationTests {

	
	@Test
	void test() {
	
		Assertions.assertThat(1).isEqualTo(1);
	}

}
