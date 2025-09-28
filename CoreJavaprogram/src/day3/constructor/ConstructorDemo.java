package day3.constructor;


import java.util.*;

public class ConstructorDemo {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        String name, city;
	        int id;

	        // First Customer - using default constructor + setters
	        System.out.print("Enter Customer Id : ");
	        id = sc.nextInt();

	        sc.nextLine(); // consume newline
	        System.out.print("Enter Customer Name : ");
	        name = sc.nextLine();

	        System.out.print("Enter Customer City : ");
	        city = sc.nextLine();

	        System.out.println();

	        Customer c1 = new Customer(); // default constructor invoked
	        c1.setCustomerName(name);
	        c1.setCustomerId(id);
	        c1.setCustomerCity(city);
	        System.out.println("Customer 1 Details: " + c1);

	        // Second Customer - using parameterized constructor
	        System.out.print("Enter Customer Id : ");
	        id = sc.nextInt();

	        sc.nextLine(); // consume newline
	        System.out.print("Enter Customer Name : ");
	        name = sc.nextLine();

	        System.out.print("Enter Customer City : ");
	        city = sc.nextLine();

	        Customer c2 = new Customer(name, id, city); // parameterized constructor invoked
	        System.out.println("Customer 2 Details: " + c2);

	        sc.close();
			

		}

	}

