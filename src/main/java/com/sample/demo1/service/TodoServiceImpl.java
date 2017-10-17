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
			throw new RuntimeException("��ȸ����� �������� �ʽ��ϴ�.");
		}
		System.out.println("[TodoService] ��ȸ�� �� �� �� : " + todos.size());
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
