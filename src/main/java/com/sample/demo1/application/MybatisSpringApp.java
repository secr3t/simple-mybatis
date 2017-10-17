package com.sample.demo1.application;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.mappers.TodoMapper;
import com.sample.demo1.service.HRService;
import com.sample.demo1.service.TodoService;
import com.sample.demo1.vo.Employee;
import com.sample.demo1.vo.Todo;

public class MybatisSpringApp {
 
	public static void main(String[] args) {
//		String resources = "classpath:/META-INF/spring/app-context.xml";
//		String resources = "classpath:/META-INF/spring/app-mapper-scanner-context.xml"; 
		String resources = "classpath:/META-INF/spring/app-mybatis-tag-context.xml";
		@SuppressWarnings("resource")
		ApplicationContext context = new GenericXmlApplicationContext(resources);
		
		HRService hrService = context.getBean(HRService.class);
		List<Employee> employees2 = hrService.getAllEmployees();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
		
		EmployeeMapper mapper = context.getBean(EmployeeMapper.class);
		List<Employee> employees = mapper.getAllEmployees();
		System.out.println("조회된 사원 수 : " + employees.size());
		
		TodoMapper todoMapper = context.getBean(TodoMapper.class);
		TodoService todoService = context.getBean(TodoService.class);
		List<Todo> todos = todoMapper.getAllTodos();
		todoMapper.deleteTodo(3);
		
		
		
		Todo inputVal = new Todo();
		inputVal.setNo(todoService.getSeq());
		inputVal.setContents("mybatis 추가 테스트 내용은 없습니다. 제곧내.");
		inputVal.setDates(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
		inputVal.setTitle("mybatis addTodo");
		
		todoService.addTodo(inputVal);
		
		todos = todoService.getAllTodos();
	
	}

}
