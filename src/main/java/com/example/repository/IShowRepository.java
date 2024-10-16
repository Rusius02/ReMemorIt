package com.example.repository;

import com.example.model.Show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IShowRepository extends JpaRepository<Show,Long> {
}
