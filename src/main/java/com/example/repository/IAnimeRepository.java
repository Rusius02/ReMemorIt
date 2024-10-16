package com.example.repository;

import com.example.model.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAnimeRepository extends JpaRepository<Anime,Long> {
}
