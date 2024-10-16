package com.example.repository;

import com.example.model.VideoGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVideoGameRepository extends JpaRepository<VideoGame, Long> {
}
