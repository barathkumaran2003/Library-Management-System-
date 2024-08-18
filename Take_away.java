package RECORDS;

import java.sql.*;
import java.util.*;

public class Take_away {
	private Connection connection;
    private Scanner scanner;
    public Take_away(Connection connection, Scanner scanner)
    {
        this.connection = connection;
        this.scanner = scanner;
    }
    public void takeaway()
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
	
		        System.out.print("Enter the Name of the Book :");
		        String book_name=scanner.next();
		        System.out.print("Enter the Number of the Book :");
		        String book_number=scanner.next();
		        try{
		        	PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM books WHERE Mystery = ? and Coloumn_no_1 = ? ");
	                preparedStatement.setString(1, book_name);
	                preparedStatement.setString(2, book_number);
	                ResultSet resul_set = preparedStatement.executeQuery();

	                if (resul_set.next())
	                {
	                    String credit_query = "UPDATE books SET Mystery=? WHERE Coloumn_no_1=?";
	                    PreparedStatement preparedStatement1 = connection.prepareStatement(credit_query);
	                    preparedStatement1.setString(1, "Book is Currently unavailable" ); 
	                    preparedStatement1.setString(2, book_number);
	                    int rowsAffected = preparedStatement1.executeUpdate();
	                    if (rowsAffected > 0)
	                    {
	                        System.out.println("Book takenaway Successfully");
	                        
	                    } 
	                }
		        }
		        catch (SQLException e)
			    {
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
