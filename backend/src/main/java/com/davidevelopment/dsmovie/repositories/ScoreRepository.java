package com.davidevelopment.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davidevelopment.dsmovie.entities.Score;
import com.davidevelopment.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
