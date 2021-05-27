package com.mtit.microservices.accountservice.repository;

import com.mtit.microservices.accountservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,String >{
}
