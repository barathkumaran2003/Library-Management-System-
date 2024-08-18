package RECORDS;

import java.sql.*;
import java.util.*;

public class Buying_Books {
	private Connection connection;
    private Scanner scanner;
    public Buying_Books(Connection connection, Scanner scanner)
    {
        this.connection = connection;
        this.scanner = scanner;
    }
    public void buy()
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
		 System.out.print("Enter the type of the book: ");
		 String book_type=scanner.next();
		 System.out.print("Enter the name of the book: ");
		 String buy_book_name=scanner.next();
		 System.out.print("Enter the number of the book: ");
		 String buy_book_no=scanner.next();
		 if(book_type.equals("Mystery"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Mystery=? WHERE Coloumn_no_1=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }
		 else if(book_type.equals("Scienc_fiction"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Scienc_fiction=? WHERE Coloumn_no_2=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Historical"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Historical=? WHERE Coloumn_no_3=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Poetry"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Poetry=? WHERE Coloumn_no_4=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Comics"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Comics=? WHERE Coloumn_no_5=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Apptitude"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Apptitude=? WHERE Coloumn_no_6=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Self-help_book"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Self-help_book=? WHERE Coloumn_no_7=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	else if(book_type.equals("Crime_fiction"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Crime_fiction=? WHERE Coloumn_no_8=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Drama"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Drama=? WHERE Coloumn_no_9=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }
		 else if(book_type.equals("Horror"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Horror=? WHERE Coloumn_no_10=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Cookbook"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Cookbook=? WHERE Coloumn_no_11=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Biography"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Biography=? WHERE Coloumn_no_12=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Financial_Management"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Financial_Management=? WHERE Coloumn_no_13=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 else if(book_type.equals("Time_Management"))
		 {
		
		 try {
			
		        // Update the record identified by a unique condition (e.g., book_id or user_id)
		        String creditQuery = "UPDATE books SET Comics=? WHERE Coloumn_no_14=?";  // Assuming `user_id` is the identifier
		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
		        preparedStatement1.setString(1, "BOOK IS CURRENTLY UNAVAILABLE");
		        preparedStatement1.setString(2, buy_book_no);
		        int rowsAffected = preparedStatement1.executeUpdate();
		        System.out.println();
		        if (rowsAffected > 0) {
		      
		            System.out.println("* THANK YOU FOR BUYING THE BOOK *");
		        } else {
		            System.out.println(" WRONG BOOK NO");
		       }
   		 
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		 }	
		 
		 
		 
    }

}
