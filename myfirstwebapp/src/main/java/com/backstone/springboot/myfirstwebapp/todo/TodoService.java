package com.backstone.springboot.myfirstwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount=0;
    static {
        todos.add(new Todo(todoCount++, "backstone", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todoCount++, "backstone", "Learn DevOps",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(todoCount++, "backstone", "Learn Full Stack Development",
                LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }

    public void addTodos(String name, String description, LocalDate targetDate, boolean done){
        todos.add(new Todo(todoCount++, name, description, targetDate, done));
    }
}