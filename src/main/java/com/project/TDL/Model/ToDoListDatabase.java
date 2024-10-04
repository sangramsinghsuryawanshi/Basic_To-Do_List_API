package com.project.TDL.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoListDatabase 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String discription;
	private String status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public ToDoListDatabase(int id, String discription, String status) {
		super();
		this.id = id;
		this.discription = discription;
		this.status = status;
	}
	@Override
	public String toString() {
		return "ToDoListDatabase [id=" + id + ", discription=" + discription + ", status=" + status + "]";
	}
	public ToDoListDatabase() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
