package com.day11.mongo.demo;

import java.time.LocalDate;

import java.util.Scanner;



public class Cs1M {

	public static Object main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter train no:  ");
       int trainNo = sc.nextInt();
       Cs1Main main= new Cs1Main();
       Cs1 cs1 = main.findCs1(trainNo);
       
       System.out.println("Enter Travel date in 1format DD/MM/YYYY:  \n  ");
       String[] arr = sc.next().split("/");
       LocalDate travelDate = LocalDate.of(Integer.parseInt(arr[2]),Integer.parseInt(arr[1]), Integer.parseInt(arr[0]) );
       
       
       try {
    	   if(travelDate.compareTo(LocalDate.now())<0) {
    		   String msg = "Date is before present date";
    		   InvalidInputException ex1 = new InvalidInputException(msg);
    		   throw ex1;
    	   }
    	   
    	   
       }catch(InvalidInputException e1) {
    	   e1.printStackTrace();
    	   System.exit(1);
    	   return null;
       }
       System.out.println("Enter number of passengers: \n");
       int number = sc.nextInt();
       Ticket ticketn= new Ticket(travelDate, cs1);
       
       
       
       System.out.println("Enter passenger name: \n");
       String name1 = sc.next();
       System.out.println("Enter age: \n");
       int age = sc.nextInt();
       System.out.println("Enter gender: \n");
       String gender = sc.next();
       ticketn.addPassenger(name1, age, gender.charAt(0));
       
       
       }
	
	ticketn.writeTicket();

    System.out.println("Ticket is written with name: \n"+ticketn.getPnr()+".txt");

}
