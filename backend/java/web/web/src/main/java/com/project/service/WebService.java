package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.persistence.WebRepository;
import com.project.web.model.WebEntity;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class WebService {
	
	@Autowired
	private WebRepository repository;
	
	public void vaildate(WebEntity entity) {
		
		if(entity == null) {
			log.warn("Unknown user");
			throw new RuntimeException("Unknown user");
		}
	}

}