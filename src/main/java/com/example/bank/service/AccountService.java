/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.bank.service;

import com.example.bank.dto.AccountDto;
import java.util.List;

/**
 *
 * @author FreezinFire
 */
public interface AccountService {
    AccountDto createAccount(AccountDto account);
    
    AccountDto getAccountById(Long id);
    
    AccountDto deposit(Long id, double amount);
    
    AccountDto withdraw(Long id, double amount);
    
    List<AccountDto> getAllAccounts();
    
    void deleteAccount(Long id);
}
