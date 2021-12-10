package com.jankenfighteralpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jankenfighteralpha.entity.Avatar;

@Repository
public interface AvatarRepository extends JpaRepository<Avatar,Integer> {
	@Query(value = "SELECT a FROM Avatar a WHERE a.avatarId = ?1")
	Avatar findById(int avatarId);
}
