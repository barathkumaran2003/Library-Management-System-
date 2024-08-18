package RECORDS;

import java.sql.*;
import java.util.*;

public class Library_User {
	private Connection connection;
	private Scanner scanner;

	public Library_User(Connection connection, Scanner scanner)
	{
	    this.connection = connection;
	    this.scanner = scanner;
	}
	public void register()
	{
	    scanner.nextLine();
	    System.out.println();
	    System.out.println("* Are you willing to be a Member *");
	    System.out.println("1. YES");
	    System.out.println("2. NO");
	    System.out.print("Enter your choice: ");
	    int choice=scanner.nextInt();
	    if(choice==1)
	    {
	    	
	    System.out.print("Full Name: ");
	    String full_name = scanner.next();
	    System.out.print("Mobile Number: ");
	    String mobile_number = scanner.next();
	    System.out.print("Email: ");
	    String email = scanner.next();
	    System.out.print("Password: ");
	    String password = scanner.next();
	    System.out.println("* Member Ship cost Rs.500/- *");
	    System.out.print("Ente the amount: ");
	    String amount=scanner.next();
	    if(Library_User_exist(email, mobile_number)) 
	    {
	        System.out.println("User Already Exists for this Email Address or Mobile Number!!");
	        return;
	    }
	    String register_query = "INSERT INTO register(full_name, mobile_number, email, password, Member_ship) VALUES(?, ?, ?, ?, ?)";
	    try {
	        PreparedStatement preparedStatement = connection.prepareStatement(register_query);
	        preparedStatement.setString(1, full_name);
	        preparedStatement.setString(2, mobile_number);
	        preparedStatement.setString(3, email);
	        preparedStatement.setString(4, password);
	        preparedStatement.setString(5, amount);
	        int affectedRows = preparedStatement.executeUpdate();
	        if (affectedRows > 0)
	        {
	            System.out.println("Registration Successfull!");
	        } 
	        else 
	        {
	            System.out.println("Registration Failed!");
	        }
	    }
	    catch (SQLException e)
	    {
	        e.printStackTrace();
	    }
	    }
	    else if(choice==2)
	    {
	    	System.out.print("Full Name: ");
		    String full_name = scanner.next();
		    System.out.print("Mobile Number: ");
		    String mobile_number = scanner.next();
		    System.out.print("Email: ");
		    String email = scanner.next();
		    System.out.print("Password: ");
		    String password = scanner.next();
		    if(Library_User_exist(email, mobile_number)) 
		    {
		        System.out.println("User Already Exists for this Email Address or Mobile Number!!");
		        return;
		    }
		    String register_query = "INSERT INTO register(full_name, mobile_number, email, password) VALUES(?, ?, ?, ?)";
		    try {
		        PreparedStatement preparedStatement = connection.prepareStatement(register_query);
		        preparedStatement.setString(1, full_name);
		        preparedStatement.setString(2, mobile_number);
		        preparedStatement.setString(3, email);
		        preparedStatement.setString(4, password);
		        
		        int affectedRows = preparedStatement.executeUpdate();
		        if (affectedRows > 0)
		        {
		            System.out.println("Registration Successfull!");
		        } 
		        else 
		        {
		            System.out.println("Registration Failed!");
		        }
		    }
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    }
	}
	public String login_mobile()
	{
        	scanner.nextLine();
        	System.out.print("Mobile Number: ");
        	String mobile_number=scanner.nextLine();
        	System.out.print("Password: ");
    	    String password = scanner.nextLine();
    	    String login_query = "SELECT * FROM register WHERE mobile_number=? AND password = ?";
    	    try
    	    {
    	        PreparedStatement preparedStatement = connection.prepareStatement(login_query);
    	        preparedStatement.setString(1, mobile_number);
    	        preparedStatement.setString(2, password);
    	        ResultSet resultSet = preparedStatement.executeQuery();
    	        if(resultSet.next())
    	        {
    	            return mobile_number;
    	        }
    	        else
    	        {
    	            return null;
    	        }
    	    }
    	    catch (SQLException e)
    	    {
    	        e.printStackTrace();
    	    }
    	    return null;
    }
	public String login_email()
	{
	    scanner.nextLine();
	    System.out.print("Email: ");
	    String email = scanner.nextLine();
	    System.out.print("Password: ");
	    String password = scanner.nextLine();
	    String login_query = "SELECT * FROM register WHERE email = ? AND password = ?";
	    try{
	        PreparedStatement preparedStatement = connection.prepareStatement(login_query);
	        preparedStatement.setString(1, email);
	        preparedStatement.setString(2, password);
	        ResultSet resultSet = preparedStatement.executeQuery();
	        if(resultSet.next())
	        {
	            return email;
	        }
	        else
	        {
	            return null;
	        }
	    }
	    catch (SQLException e)
	    {
	        e.printStackTrace();
	    }
	    return null;
	}


	private boolean Library_User_exist(String email, String mobile_number) {
		String query = "SELECT * FROM register WHERE email = ? OR mobile_number = ?";
	    try{
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, email);
	        preparedStatement.setString(2, mobile_number);
	        ResultSet resultSet = preparedStatement.executeQuery();
	        if(resultSet.next())
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	    catch (SQLException e)
	    {
	        e.printStackTrace();
	    }
	    return false;
	}


}
