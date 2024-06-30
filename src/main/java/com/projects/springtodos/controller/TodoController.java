package com.projects.springtodos.controller;

import com.projects.springtodos.TodoService;
import com.projects.springtodos.Todos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping("/list-todos")
    public String listTodos(ModelMap modelMap) {
        List<Todos> todos = todoService.findByUserName("Radhe");
        modelMap.put("todos", todos);
        return "listTodos";
    }
}
