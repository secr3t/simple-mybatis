package com.sample.demo1.service;

import java.util.List;

import com.sample.demo1.vo.Todo;

public interface TodoService {
	List<Todo> getAllTodos();
	void addTodo(Todo todo);
	void deleteTodo(int no);
	int getSeq();
}
