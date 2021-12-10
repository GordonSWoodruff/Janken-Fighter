package com.jankenfighteralpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jankenfighteralpha.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
	@Query(value = "SELECT u FROM Users u WHERE u.userId = ?1")
	Users findById(int userId);
}
