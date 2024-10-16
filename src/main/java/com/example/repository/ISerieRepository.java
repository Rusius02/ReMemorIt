package com.example.repository;

import com.example.model.Serie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISerieRepository extends JpaRepository<Serie,Long> {
}
