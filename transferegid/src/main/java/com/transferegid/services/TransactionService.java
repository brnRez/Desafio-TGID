package com.transferegid.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transferegid.domain.user.Users;
import com.transferegid.dtos.TransactionDTO;
import com.transferegid.repositories.TransactionRepository;

@Service
public class TransactionService {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private TransactionRepository repository;
	
	public void createTransaction(TransactionDTO transaction) throws Exception {
		Users sender = this.userService.findUserById(transaction.senderId());
		
		Users receiver = this.userService.findUserById(transaction.receiverId());
		
		userService.validateTransaction(sender, transaction.value());
		
		
	}
	
}
