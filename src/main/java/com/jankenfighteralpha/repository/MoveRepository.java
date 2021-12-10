package com.jankenfighteralpha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.jankenfighteralpha.entity.Moveset;

@Repository
public interface MoveRepository extends JpaRepository<Moveset,Integer>{
	@Query(value = "SELECT m FROM Moveset m WHERE m.movesetId = ?1")
	Moveset findById(int movesetId);
}
