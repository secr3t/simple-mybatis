package com.sample.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sample.demo1.mappers.TodoMapper;
import com.sample.demo1.vo.Todo;

public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoMapper todoMapper;

	public List<Todo> getAllTodos() {
		List<Todo> todos = todoMapper.getAllTodos();
		if (todos.isEmpty()) {
			throw new RuntimeException("조회결과가 존재하지 않습니다.");
		}
		System.out.println("[TodoService] 조회된 할 일 수 : " + todos.size());
		return todos;
	}

	public void addTodo(Todo todo) {
		todoMapper.addTodo(todo);
	}

	public void deleteTodo(int no) {
		todoMapper.deleteTodo(no);
	}

	public int getSeq() {
		return todoMapper.getSeq();
	}

}
