package com.example.Shoppingmall_malladmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.Shoppingmall_malladmin.entity.Malladmin_entity;

@Repository
public interface Malladmin_repo extends JpaRepository<Malladmin_entity, Long> {
    // Optional: for login functionality (not used yet)
    Malladmin_entity findByNameAndPassword(String name, String password);
}
