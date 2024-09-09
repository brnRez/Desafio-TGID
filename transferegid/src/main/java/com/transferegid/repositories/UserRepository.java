package com.transferegid.repositories;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transferegid.domain.user.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
	
	Optional<Users> findUserByDocument(String document);
	Optional<Users> findUserByid(Long id);
	
	

}
