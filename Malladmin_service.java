package com.example.Shoppingmall_malladmin.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Shoppingmall_malladmin.entity.Malladmin_entity;
import com.example.Shoppingmall_malladmin.repository.Malladmin_repo;

@Service
public class Malladmin_service {
	
	@Autowired
	public Malladmin_repo rp;
	
	// CREATE
	public Malladmin_entity addAdmin(Malladmin_entity admin) {
		return rp.save(admin);
	}
	
	// READ
	public List<Malladmin_entity> getAllAdmins() {
		return rp.findAll();
	}
	
	// DELETE
	public void deleteAdmin(Long id) {
		rp.deleteById(id);
	}
}