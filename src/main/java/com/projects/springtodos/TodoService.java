package com.projects.springtodos;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;

@Service
public class TodoService {
    private static List<Todos> todos = new ArrayList<>();
    static {
        todos.add(new Todos(1,"Radhe","Learn Spring",false, LocalDate.now().plusYears(2)));
        todos.add(new Todos(2,"Radhe","Learn AWS",false, LocalDate.now().plusYears(2)));
        todos.add(new Todos(3,"Radhe","Learn AZURE",false, LocalDate.now().plusYears(2)));
        todos.add(new Todos(4,"Radhe","Learn security",false, LocalDate.now().plusYears(2)));
    }

    public List<Todos> findByUserName(String user) {

        return todos;
    }
}
