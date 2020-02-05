package com.icbt.repository;

import com.icbt.dto.Cake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CakeRepositary extends JpaRepository<Cake, Integer> {

}
