package com.project.TDL.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.TDL.Model.ToDoListDatabase;

public interface ToDoListConn extends JpaRepository<ToDoListDatabase, Integer> {

}
