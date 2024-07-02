package com.cjc.main.serviceimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;
@Service
public class HomeServiceImple implements HomeService{
	@Autowired HomeRepository homeRepository;

	@Override
	public Student SaveStudentDetails(Student stu) {
	
		return homeRepository.save(stu);
	}
	
	

}
