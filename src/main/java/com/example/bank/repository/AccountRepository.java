/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bank.entity.Account;


/**
 *
 * @author FreezinFire
 */
public interface AccountRepository extends JpaRepository<Account, Long>{
    
}
