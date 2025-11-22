package com.backstone.springboot.myfirstwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCount = 0;

    static {
        todos.add(new Todo(todoCount++, "backstone", "Learn AWS",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todoCount++, "backstone", "Learn DevOps",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(todoCount++, "backstone", "Learn Full Stack Development",
                LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findByUsername(String username) {
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equals(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodos(String name, String description, LocalDate targetDate, boolean done) {
        todos.add(new Todo(todoCount++, name, description, targetDate, done));
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public void updateByID(int id, String description) {
        Todo todo = todos.get(id);
        todo.setDescription(description);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> pridicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(pridicate).findFirst().get();
        return todo;
    }

    public void updateTodos(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}