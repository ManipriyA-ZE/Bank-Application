package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Account;
@Repository
public interface AccountRepo  extends JpaRepository<Account, Integer>{

	Optional<Account> findById(Optional<Account> id);

}
