package com.kgl.Gaming_Club.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kgl.Gaming_Club.entiity.Game;

@Repository

public interface GameRepository extends JpaRepository<Game,Integer>{

}
