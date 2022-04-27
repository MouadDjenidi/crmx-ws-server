package com.onex.crmx.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.onex.crmx.entity.Account;


@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	
	@Query(value  = "SELECT * FROM Account a WHERE a.account_name = :account_name" , nativeQuery = true)
	Optional<Account> findAccountByName(@Param("account_name") String name);
	
}