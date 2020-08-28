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
 * @author awv6
 */
public class Customer {

    private ArrayList<CustomerIf> customers = new ArrayList();

    public Customer() {
        ArrayList<AccountIf> cust1Accounts = new ArrayList();
        AccountIf acc = new BankAccount(12345);
        acc.deposit(400);
        cust1Accounts.add(acc);
        acc = new BankAccount(54321);
        acc.deposit(1000);
        cust1Accounts.add(acc);
        CustomerIf customer1 = new BankCustomer("John", cust1Accounts);
        customers.add(customer1);

        ArrayList<AccountIf> cust2Accounts = new ArrayList();
        acc = new BankAccount(56789);
        acc.deposit(15000);
        cust1Accounts.add(acc);
        acc = new BankAccount(98765);
        acc.deposit(250000);
        cust1Accounts.add(acc);
        CustomerIf customer2 = new BankCustomer("Jane", cust2Accounts);
        customers.add(customer2);
    }

    public void doDeposit(double amt, CustomerIf cust, int accNo) {
        cust.getAccount(accNo).deposit(amt);
    }

    public AccountIf getBankAccount(CustomerIf cust, int accNo) {
        return cust.getAccount(accNo);
    }

    public CustomerIf getBankCustomer(String custName) {
        for (CustomerIf cus : customers) {
            if (cus.getCustomerName().equals(custName)) {
                return cus;
            }
        }
        return null;
    }

}
