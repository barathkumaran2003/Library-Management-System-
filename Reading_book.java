package RECORDS;

import java.sql.*;
import java.util.*;

public class Reading_book {
	private Connection connection;
    private Scanner scanner;
    public Reading_book(Connection connection, Scanner scanner)
    {
        this.connection = connection;
        this.scanner = scanner;
    }
    public void reading()
    {
    	System.out.println();
	    System.out.println("* Select The Type of the Book you Want to Read *");
	    System.out.println("1. Mystery");
	    System.out.println("2. Science fiction");
	    System.out.println("3. Historical");
	    System.out.println("4. Poetry");
	    System.out.println("5. Comics");
	    System.out.println("6. Apptitude");
	    System.out.println("7. Self-help book");
	    System.out.println("8. Crime fiction");
	    System.out.println("9. Drama");
	    System.out.println("10. Horror");
	    System.out.println("11. Cookbook");
	    System.out.println("12. Biography");
	    System.out.println("13. Financial Management");
	    System.out.println("14. Time Management");
	    System.out.print("Enter your choice :");
	    int choice5=scanner.nextInt();
	    switch(choice5)
	    {
	    case 1:
	    	System.out.println();
	    	System.out.println("The List of Mystery books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Mystery=? WHERE Coloumn_no_1=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 2:
	    	System.out.println();
	    	System.out.println("The List of Science fiction books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(3)+" "+resultSet.getString(4));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Scienc_fiction=? WHERE Coloumn_no_2=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 3:
	    	System.out.println();
	    	System.out.println("The List of Historical books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(5)+" "+resultSet.getString(6));
		        System.out.println();
		        
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Historical=? WHERE Coloumn_no_3=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 4:
	    	System.out.println();
	    	System.out.println("The List of Poetry books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(7)+" "+resultSet.getString(8));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Poetry=? WHERE Coloumn_no_4=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 5:
	    	System.out.println();
	    	System.out.println("The List of Comics books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(9)+" "+resultSet.getString(10));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Comics=? WHERE Coloumn_no_5=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 6:
	    	System.out.println();
	    	System.out.println("The List of Apptitude books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(11)+" "+resultSet.getString(12));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Apptitude=? WHERE Coloumn_no_6=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 7:
	    	System.out.println();
	    	System.out.println("The List of Self-help_book and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(13)+" "+resultSet.getString(14));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Selfhelp_book=? WHERE Coloumn_no_7=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 8:
	    	System.out.println();
	    	System.out.println("The List of Crime_fiction books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(15)+" "+resultSet.getString(16));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Crime_fiction=? WHERE Coloumn_no_8=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 9:
	    	System.out.println();
	    	System.out.println("The List of Drama books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(17)+" "+resultSet.getString(18));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Drama=? WHERE Coloumn_no_9=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 10:
	    	System.out.println();
	    	System.out.println("The List of Horror books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(19)+" "+resultSet.getString(20));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Horror=? WHERE Coloumn_no_10=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 11:
	    	System.out.println();
	    	System.out.println("The List of Cookbook books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(21)+" "+resultSet.getString(22));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Cookbook=? WHERE Coloumn_no_11=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 12:
	    	System.out.println();
	    	System.out.println("The List of Biography books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(23)+" "+resultSet.getString(24));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Biography=? WHERE Coloumn_no_12=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 13:
	    	System.out.println();
	    	System.out.println("The List of Financial_Management books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(25)+" "+resultSet.getString(26));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Financial_Management=? WHERE Coloumn_no_13=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    case 14:
	    	System.out.println();
	    	System.out.println("The List of Time_Management books and their Numbers: ");
	    	try{
		    	Statement sum=connection.createStatement();
		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
		        while(resultSet.next())
		        System.out.println(resultSet.getString(27)+" "+resultSet.getString(28));
		        System.out.println();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try {
					
			        // Update the record identified by a unique condition (e.g., book_id or user_id)
			        String creditQuery = "UPDATE books SET Time_Management=? WHERE Coloumn_no_14=?";  // Assuming `user_id` is the identifier
			        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
			        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
			        preparedStatement1.setString(2, book_number);
			        int rowsAffected = preparedStatement1.executeUpdate();
			        System.out.println();
			        if (rowsAffected > 0) {
			      
			            System.out.println("* THANK YOU FOR READING THE BOOK *");
			        } else {
			            System.out.println(" WRONG BOOK NO");
			       }
	   		 
			    } catch (SQLException e) {
			        e.printStackTrace();
			    }
		       }                            		                              		    
		    catch (SQLException e)
		    {
		        e.printStackTrace();
		    }
	    	break;
	    	
	    }
    }

}
