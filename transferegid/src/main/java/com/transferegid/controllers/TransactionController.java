package com.transferegid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.transferegid.domain.transaction.transaction;
import com.transferegid.dtos.TransactionDTO;
import com.transferegid.services.TransactionService;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
	
	@Autowired
	private TransactionService transactionService;
	
	@PostMapping
	public ResponseEntity<transaction> createTransaction (@RequestBody TransactionDTO transaction) throws Exception{
		transaction newTransaction = this.transactionService.createTransaction(transaction);
		
		
	}

}
