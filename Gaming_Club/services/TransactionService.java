package com.kgl.Gaming_Club.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kgl.Gaming_Club.Dto.TransactionDto;
import com.kgl.Gaming_Club.Repository.GameRepository;
import com.kgl.Gaming_Club.Repository.MemberRepository;
import com.kgl.Gaming_Club.Repository.TransactionRepository;
import com.kgl.Gaming_Club.entiity.Game;
import com.kgl.Gaming_Club.entiity.Member;
import com.kgl.Gaming_Club.entiity.Transaction;

@Service
public class TransactionService {
	@Autowired TransactionRepository transactionRepo;
	@Autowired MemberRepository memberRepo;
	@Autowired GameRepository gameRepo;
	
	public Transaction plaayGame(TransactionDto transactionDto) {
		Member member = memberRepo.findById(transactionDto.getMember_id()).get();
		Game game = gameRepo.findById(transactionDto.getMember_id()).get();
		
		Transaction transaction = new Transaction();
		transaction.setGame(game);
		transaction.setDate_time(LocalDateTime.now());
		transaction.setMember(member);
		transactionRepo.save(transaction);
		
		member.setBalance(member.getBalance() - game.getAmount());
		memberRepo.save(member);
		
		return transaction;
	}
}

