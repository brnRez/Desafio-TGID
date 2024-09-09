package com.transferegid.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.transferegid.domain.transaction.transaction;

public interface TransactionRepository extends JpaRepository<transaction, Long>{

}
