/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.bank.service.impl;

import com.example.bank.dto.AccountDto;
import com.example.bank.entity.Account;
import com.example.bank.mapper.AccountMapper;
import com.example.bank.repository.AccountRepository;
import com.example.bank.service.AccountService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

/**
 *
 * @author FreezinFire
 */
@Service
public class AccountServiceImpl implements AccountService{
    
    private AccountRepository accountRepository;
    
    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found!"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found!"));
        double total = account.getBalance() + amount;
        account.setBalance(total);
        
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }    

    @Override
    public AccountDto withdraw(Long id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found!"));
        if(account.getBalance() < amount){
            throw new RuntimeException("Insufficient balance!");
        }
        
        double total = account.getBalance() - amount;
        account.setBalance(total);
        
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream().map((account) -> AccountMapper.mapToAccountDto(account)).collect(Collectors.toList());
    }
    
    @Override
    public void deleteAccount(Long id){
        Account account = accountRepository.findById(id).orElseThrow(() -> new RuntimeException("Account not found!"));
        
        accountRepository.deleteById(id);
    }
}
