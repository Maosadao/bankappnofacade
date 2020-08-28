/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Customer facade = new Customer();
       AccountIf account;
    
       CustomerIf customer1 = facade.getBankCustomer("John");
       System.out.println("Customer and account information");
       System.out.println("Name "+customer1.getCustomerName());
       System.out.println("Has "+customer1.getNumAccounts()+" accounts");
       
       account = facade.getBankAccount(customer1, 12345);
       System.out.println("Account Number : "+account.getAccountNumber()+"has "+account.getBalance());
       
       account = facade.getBankAccount(customer1, 54321);
       System.out.println("Account Number : "+account.getAccountNumber()+"has "+account.getBalance());
       
       facade.doDeposit(600, customer1, 54321);
       System.out.println("Account Number : "+account.getAccountNumber()+"has "+account.getBalance());
      
       ArrayList<AccountIf> accounts = facade.getBankCustomer("John").getllAccounts();
       for(AccountIf acc : accounts) {
           System.out.println("Account number " + acc.getAccountNumber() + " has " + acc.getBalance());
       }
    }
    
}
