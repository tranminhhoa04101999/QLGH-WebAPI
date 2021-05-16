package com.cuoiky.QuanLyGiaoHang.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cuoiky.QuanLyGiaoHang.model.Task;
import com.cuoiky.QuanLyGiaoHang.service.TaskService;

@RestController
public class TaskController {
	@Autowired
	private TaskService service;
	
	@GetMapping("/tasks")
	public List<Task> list(){
		return service.listAll();
	}
	
	@GetMapping("/tasks/{id}")
	public Task get(@PathVariable Integer id) {
		return service.get(id);
	}
	
	@PostMapping("/tasks")
	public void add(@RequestBody Task task) {
		service.save(task);
	}
	@PostMapping("/tasks/{id}")
	public void update(@RequestBody Task task,@PathVariable Integer id) {
		service.save(task);
	}
	
	@DeleteMapping("/tasks/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}
}