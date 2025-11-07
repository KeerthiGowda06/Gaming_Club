package com.kgl.Gaming_Club.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgl.Gaming_Club.Repository.GameRepository;
import com.kgl.Gaming_Club.entiity.Game;

@Service
public class GameService {
	@Autowired
	private GameRepository gameRepo;
	
	public Game saveGame(Game game) {
		return gameRepo.save(game);
	}
	
	public List<Game> findGame() {
		return gameRepo.findAll();
	}
	
	public Game findGame(int id) {
		Optional<Game> game = gameRepo.findById(id);
		if(game.isPresent()) {
			return game.get();
		}
		return null;
	}
	
	public Game updateGame(int id ,Game game) {
		Optional<Game> optional = gameRepo.findById(id);
		if(optional.isPresent()) {
			Game oldGame = optional.get();
			oldGame.setName(game.getName());
			oldGame.setPrice(game.getPrice());
			oldGame.setDescription(game.getDescription());
			oldGame.setStatus(game.getStatus());
			return gameRepo.save(oldGame);
		}
		return null;
	}
	public boolean deleteGame(int id) {
		Optional<Game> optional = gameRepo.findById(id);
		if(optional.isPresent()) {
			gameRepo.deleteById(id);
			return true;
		}
		return false;
	}

}
