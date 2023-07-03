package com.canddella.utility;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.canddella.entity.Account;
import com.canddella.entity.Customer;
import com.canddella.service.Service;

public class Utility {

	public static void main(String[] args) {

		ArrayList<Account> accountList = Service.createAccount();

		Customer customer = Service.createCustomer(accountList);
		
		HashMap<String, ArrayList<Account>> customerAccountMap = Service.createCustomerAccountMapping(customer);

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the customer name to view all the accounts:");
		String cusName = scanner.nextLine();
		ArrayList<Account> tempaccountList = customerAccountMap.get(cusName);

		for (Account account : tempaccountList)
			System.out.println(account.getAccountNumber());

	}

}
