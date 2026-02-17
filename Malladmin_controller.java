package com.example.Shoppingmall_malladmin.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Shoppingmall_malladmin.entity.Malladmin_entity;
import com.example.Shoppingmall_malladmin.service.Malladmin_service;

// postman -> controller -> service -> repository -> database

@RestController
@RequestMapping("/admin")  // ✅ Added base path
public class Malladmin_controller {
	
	@Autowired
	public Malladmin_service ms;
	
	// CREATE
	@PostMapping("/add")
	public Malladmin_entity addAdmin(@RequestBody Malladmin_entity admin) {
		return ms.addAdmin(admin);
	}
	
	// READ
	@GetMapping("/getall")
	public List<Malladmin_entity> getAllAdmins() {
		return ms.getAllAdmins();
	}
	
	// DELETE
	@DeleteMapping("/delete/{id}")
	public String deleteAdmin(@PathVariable Long id) {
		ms.deleteAdmin(id);
		return "Admin deleted successfully";
	}
}