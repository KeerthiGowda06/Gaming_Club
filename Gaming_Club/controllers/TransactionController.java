package com.kgl.Gaming_Club.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kgl.Gaming_Club.Dto.TransactionDto;
import com.kgl.Gaming_Club.entiity.Transaction;
import com.kgl.Gaming_Club.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
@Autowired private TransactionService transactionService;
	
	@PostMapping("/play")
	public Transaction doTransaction(TransactionDto transaction) {
		return transactionService.plaayGame(transaction);
	}
}
