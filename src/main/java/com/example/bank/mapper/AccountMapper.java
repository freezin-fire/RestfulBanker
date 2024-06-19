/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.bank.mapper;

import com.example.bank.dto.AccountDto;
import com.example.bank.entity.Account;

/**
 *
 * @author FreezinFire
 */
public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto){
        Account account  = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        
        return account;
    }
    
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        
        return accountDto;
    }
}
