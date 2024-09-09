package com.transferegid.services;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transferegid.domain.user.Users;
import com.transferegid.dtos.UserDTO;
import com.transferegid.domain.user.UserType;
import com.transferegid.repositories.UserRepository;



@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public void validateTransaction(Users sender, BigDecimal amount) throws Exception {
		if(sender.getUserType() == UserType.ENTERPRISES) {
			throw new Exception ("Usuário do Tipo Empresa, não está autorizado a realizar este tipo de transação.");
		}
		
		if (sender.getBalance().compareTo(amount) <= 0) {
			throw new Exception ("Saldo insuficiente para completar transação.");
		}
		
	}
	public Users findUserById(Long id) throws Exception {
		return this.repository.findUserByid(id).orElseThrow(() -> new Exception ("Usuário não Encontrado"));
	    
		
	}
	
	public Users createUser(UserDTO data) {
		Users newUser = new Users(data);
		this.saveUser(newUser);
		return newUser;
		
	}
	
	public void saveUser(Users user) {
		this.repository.save(user);
		
	}
	

}
