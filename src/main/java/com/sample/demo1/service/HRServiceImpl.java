package com.sample.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

public class HRServiceImpl implements HRService{

	@Autowired
	private EmployeeMapper employeeMapper;
	
	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeMapper.getAllEmployees();
		if(employees.isEmpty()) {
			throw new RuntimeException("��ȸ����� �������� �ʽ��ϴ�.");
		}
		System.out.println("[HRService] ��ȸ�� ��� �� : " + employees.size());
		return employees;
	}

}
