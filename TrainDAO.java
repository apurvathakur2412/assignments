package com.day11.mongo.demo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InvalidPropertiesFormatException;


public class TrainDAO {

/*	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
       
		
		
		String sql = "CREATE DATABASE train_ticket";
        statement.executeUpdate(sql);
        System.out.println("Database created successfully...");   	  
        
        catch (SQLException e) {
        e.printStackTrace();
        }
		/*
		try {
			statement.execute(“CREATE DATABASE train_ticket”);
			statement.execute(“CREATE TABLE train_ticket (f00 char(31))”);
			Conn.commit(); // now the database physically exists
			} catch (SQLException exception) {
			// we are here if database exists
			statement.execute(“OPEN DATABASE train_ticket ”);
			}
		*/
		
	/*	int trainNo = 714;
		String trainName = "Yearite Express";
		String source = "Delhi";
		String destination = "Mumbai";
		int price = 596;
		
		
		String query1= "insert into Trains values("+trainNo+",'"+trainName+"','"+source+"','"+destination+"','"+price+"')";
		System.out.println(query1);

		/*int trainNo = 893;
		String trainName = "Great hills Express";
		String source = "Noida";
		String destination = "Gangtok";
		int price = 2581;
		*/
		
		/*String query1= "insert into Trains values("+trainNo+",'"+trainName+"','"+source+"','"+destination+"','"+price+"')";
		System.out.println(query1);
		*/
		

		
	

	public Cs1 findCs1(int trainNo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		
		Class.forName("oracle.jdbc.OracleDriver");

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE", "hr", "hr");

		Statement statement = connection.createStatement();
		//int trainNo;
		ResultSet resultset = statement.executeQuery("SELECT * from trains WHERE TRAINNO= "+ trainNo);
		
		boolean flag = resultset.next();
		
		try {
			if(!(flag)) {
				String msg = "Train not found";
				InvalidPropertiesFormatException ex = new InvalidPropertiesFormatException(msg);
				throw ex;
			}
			
		}catch(InvalidPropertiesFormatException e) {
			e.printStackTrace();
			System.exit(1);
			return null;
		}
		if(flag) {
			int trainNo1 = resultset.getInt(1);
			String trainName = resultset.getString(2);
			String source = resultset.getString(3);
			String destination = resultset.getString(4);
			int price = resultset.getInt(5);
			return new Cs1(trainNo1, trainName, source, destination, price);
		}
		connection.close();
		return null;
	}

}
