package com.mtit.microservice.bankservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BankRepository extends JpaRepository<Bank,String > {
}
