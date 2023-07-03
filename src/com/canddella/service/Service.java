package com.canddella.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.Customer;

public class Service {

	public static ArrayList<Account> createAccount() {

		ArrayList<Account> accountList = new ArrayList<>();
		accountList.add(new Account("AC100"));
		accountList.add(new Account("AC101"));
		accountList.add(new Account("AC102"));

		return accountList;
	}

	public static Customer createCustomer(ArrayList<Account> accountList) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer name:");
		String customerName = scanner.nextLine();

		return new Customer(customerName, accountList);
	}

	public static HashMap<String, ArrayList<Account>> createCustomerAccountMapping(Customer customer) {
		HashMap<String, ArrayList<Account>> customerAccountMap = new HashMap<>();
		customerAccountMap.put(customer.getCustomerName(), customer.getAccountList());

		return customerAccountMap;

	}

}
