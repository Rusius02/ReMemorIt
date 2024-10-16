package com.example.repository;

import com.example.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IActorRepository extends JpaRepository<Actor,Long> {
}
