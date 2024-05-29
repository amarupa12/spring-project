package com.example.Job.portal.service;

import com.example.Job.portal.entity.UsersType;
import com.example.Job.portal.repository.UsersTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsersTypeService {
	 private final UsersTypeRepository usersTypeRepository;

	    public UsersTypeService(UsersTypeRepository usersTypeRepository) {
	        this.usersTypeRepository = usersTypeRepository;
	    }

	    public List<UsersType> getAll() {
	        return usersTypeRepository.findAll();
	    }

}
