package com.example.repository;

import com.example.model.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISeasonRepository extends JpaRepository<Season,Long> {
}
