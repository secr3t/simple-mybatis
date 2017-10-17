package com.sample.demo1.mappers;

import java.util.List;

import com.sample.demo1.vo.Todo;

public interface TodoMapper {

	List<Todo> getAllTodos();
	void addTodo(Todo todo);
	void deleteTodo(int no);
	int getSeq();
}
