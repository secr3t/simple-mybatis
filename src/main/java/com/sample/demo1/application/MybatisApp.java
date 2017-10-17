package com.sample.demo1.application;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.sample.demo1.mappers.EmployeeMapper;
import com.sample.demo1.vo.Employee;

public class MybatisApp {

	public static void main(String[] args) throws Exception {

		String resource = "META-INF/mybatis/mybatis-config.xml";
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		
		SqlSession sqlSession = sqlSessionFactory.openSession();
		
		try {
			EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
			List<Employee> employees = mapper.getAllEmployees();
			System.out.println("��ȸ�� ��� �� : " + employees.size());
		} finally {
			sqlSession.close();
		}
	}

}
