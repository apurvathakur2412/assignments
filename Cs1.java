package com.day11.mongo.demo;

import java.sql.SQLException;

public class Cs1 {

	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	
	    }

	private int trainNo;
	private String trainName;
	private String source;
	private String destination;
	private int price;

		public Cs1(int trainNo, String trainName, String source, String destination, int price) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.price = price;
	}

		public int getTrainNo() {
			return trainNo;
		}

		public void setTrainNo(int trainNo) {
			this.trainNo = trainNo;
		}

		public String getTrainName() {
			return trainName;
		}

		public void setTrainName(String trainName) {
			this.trainName = trainName;
		}

		public String getSource() {
			return source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getDestination() {
			return destination;
		}

		public void setDestination(String destination) {
			this.destination = destination;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		
}


    
