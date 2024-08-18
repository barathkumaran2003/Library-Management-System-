package RECORDS;

import java.sql.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Library_Records {
	private static final String url = "jdbc:mysql://localhost:3306/library";
    private static final String username = "root";
    private static final String password = "1234";

	public static void main(String[] args) {
		try{
            Connection connection = DriverManager.getConnection(url, username, password);
            Scanner scanner =  new Scanner(System.in);
            Library_User library_user = new Library_User(connection, scanner);
            Reading_book Reading_book = new Reading_book(connection,scanner);
            Replace_book Replace_book = new Replace_book(connection,scanner);
            Take_away Take_away = new Take_away(connection,scanner);
            Buying_Books Buying_Books=new Buying_Books(connection,scanner);
            String mobile_number=null;
            String email = null;
            while(true)
            {
                System.out.println("* WELCOME TO LIBRARY *");
                System.out.println();
                System.out.println("1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                int choice1 = scanner.nextInt();
                switch (choice1)
                {
                    case 1:
                    	library_user.register();
                        break;
                    case 2:
                    	
                    	System.out.println("* LOGIN TO PORTAL USING *");
                        System.out.println();
                        System.out.println("1. Mobile Number");
                        System.out.println("2. email");
                        System.out.print("Enter your choice: ");
                    	int choice2=scanner.nextInt();
                    	if(choice2==1)
                    	{
                    		mobile_number=library_user.login_mobile();
                    		if(mobile_number!=null)
                            {
                                System.out.println();
                               System.out.println("User Logged In!");
                            }
                    		else
	                        {
	                            System.out.println("Incorrect Mobile Number or Password!");
	                            break;
	                        }
                    	}
                    	else if(choice2==2)
                    	{
                    		email=library_user.login_email();
                    		if(email!=null)
                            {
                                System.out.println();
                               System.out.println("User Logged In!");
                            }
                    		else
	                        {
	                            System.out.println("Incorrect Email or Password!");
	                            break;
	                        }
                    	}
                    	 System.out.println();
                    	 System.out.println("Are you a :");
                         System.out.println("1. Member");
                         System.out.println("2. Non-Member");                         
                         System.out.print("Enter your choice: ");
                         int choice3=scanner.nextInt();
                         if(choice3==1)
                         {
                        	 System.out.println();
                        	 System.out.println("1. Reading");
                        	 System.out.println("2. Replace");
                        	 System.out.println("3. Return Book");
                        	 System.out.println("4. Takeaway");
                        	 System.out.println("5. Due");
                        	 System.out.println("6. Buy");
                        	 System.out.println("7. Membership Revile");                       	 
                        	 System.out.print("Enter your choice: ");
                        	 int choice4=scanner.nextInt();
                        	 switch(choice4)
                        	 {
                        	 case 1:
                        		 System.out.println();
                        		 System.out.println("* THESE ARE THE LIST OF BOOKS *");
                        		    String query = "SELECT * FROM books";
                        		    try{
                        		    	Statement sum=connection.createStatement();
                        		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
                        		        while(resultSet.next())                      		       
                        		        System.out.println(resultSet.getString(1)+"| |"+resultSet.getString(3)+"| |"+resultSet.getString(5)+"| |"+resultSet.getString(7)+"| |"
                        		        		+resultSet.getString(9)+"| |"+resultSet.getString(11)+"| |"+resultSet.getString(13)+"| |");
                        		    }
                        		    catch (SQLException e)
                        		    {
                        		        e.printStackTrace();
                        		    }
                        		    Reading_book.reading();
                        		    break;
                        	 case 2 :
                        		 Replace_book.reading();
                        		 break;
                        	 case 3:           
                        		 System.out.println();
                        		 Replace_book.reading();
                 		       System.out.print("Enter your Mobile number: ");
               		        String mobil_number=scanner.next();
               		        LocalDate currentDate = LocalDate.now();
                   		    java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);

                   		    try {
                   		        // Update the record identified by a unique condition (e.g., book_id or user_id)
                   		        String creditQuery = "UPDATE register SET Book_returning_date=? WHERE mobile_number=?";  // Assuming `user_id` is the identifier
                   		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);
                   		        preparedStatement1.setDate(1, sqlDate);
                   		        preparedStatement1.setString(2, mobil_number);
                   		        int rowsAffected = preparedStatement1.executeUpdate();
                   		        System.out.println();
                   		        if (rowsAffected > 0) {
                   		      
                   		            System.out.println("* Book return Successfully *");
                   		        } else {
                   		            System.out.println("Wrong Mobile number");
                   		        }
                   		    } catch (SQLException e) {
                   		        e.printStackTrace();
                   		    }
                 		       
                 		        break;
                        	 case 4:
                        		    System.out.println();
                        		    Reading_book.reading();
                        		    System.out.println();
                        		    System.out.print("Enter your Mobile number: ");
                    		        String mobil_number1=scanner.next();
                        		   
                        		    LocalDate currentDate1 = LocalDate.now();
                        		    java.sql.Date sqlDate1 = java.sql.Date.valueOf(currentDate1);

                        		    try {
                        		        
                        		        String creditQuery = "UPDATE register SET Book_taking_date=? WHERE mobile_number=?";  
                        		        PreparedStatement preparedStatement1 = connection.prepareStatement(creditQuery);

                        		       
                        		        preparedStatement1.setDate(1, sqlDate1);
                        		        preparedStatement1.setString(2, mobil_number1);

                        		    
                   

                        		        int rowsAffected = preparedStatement1.executeUpdate();
                        		        System.out.println();
                        		        if (rowsAffected > 0) {
                        		      
                        		            System.out.println("Book Taking date updated successfully, The Dead line is 14 Days from today.");
                        		        } else {
                        		            System.out.println("Wrong Mobile number");
                        		        }
                        		    } catch (SQLException e) {
                        		        e.printStackTrace();
                        		    }
                        		    break;
                         	 case 5:
                        		 System.out.println();
                        		 System.out.println("Enter the Mobile Number: ");
                        		 String Mobile_num=scanner.next();
                        		 System.out.println("Enter the Todays Date :");
                        		 String Date=scanner.next();
                        		 System.out.println("Enter book taking date");
                        		 String Date_no=scanner.next();
                        		 LocalDate currentDate3 = LocalDate.parse(Date);
                        		 LocalDate currentDate2 = LocalDate.parse(Date_no);
                        		 java.sql.Date sqlDate2 = java.sql.Date.valueOf(currentDate2);
                        		 
                        	     int daysBetween = (int) ChronoUnit.DAYS.between(currentDate2,currentDate3 );
                        	     String login_query = "SELECT * FROM register WHERE Book_taking_date = ?";
                         	    try
                         	    {
                         	        PreparedStatement preparedStatement = connection.prepareStatement(login_query);
                         	       
                         	        preparedStatement.setDate(1, sqlDate2);
                         	        ResultSet resultSet = preparedStatement.executeQuery();
                         	        if(resultSet.next())
                         	        {
                         	        	
                         	        	try{
                         	        		String Due_query="UPDATE register SET Due=? WHERE mobile_number=?";
                         	        		 PreparedStatement preparedStatement1 = connection.prepareStatement(Due_query);
                             		        preparedStatement1.setInt(1, daysBetween);
                             		        preparedStatement1.setString(2, Mobile_num);
                             		        int rowsAffected = preparedStatement1.executeUpdate();
                             		        System.out.println();
                             		        if (rowsAffected > 0) 
                             		        {
                             		      
                             		        	System.out.println("Your Due amount is Rs." + daysBetween+"/-");                             		        
                             		        } 
                             		        else 
                             		        {
                             		        	System.out.println("Wrong Mobile Number");
                             		        }                             		  	
                         	        	}
                         	        	catch (SQLException e) {
                            		        e.printStackTrace();
                            		    }

                         	        }
                         	        else
                         	        {
                         	            System.out.println("Wrong Book taken Date");
                         	        }
                         	    }
                         	    catch (SQLException e)
                         	    {
                         	        e.printStackTrace();
                         	    }
                         	    break;

                        	 case 6:
                        		 Buying_Books.buy();
                        		 break;
                        	 case 7:
                        		 System.out.println();
                        		 System.out.print("Enter Mobile number: ");
                        		 String mob_no=scanner.next();
                        		 System.out.print("Enter the amount :");
                        		 String member=scanner.next();
                        		 try{
                        			 String member_query="UPDATE register SET Member_ship=? WHERE mobile_number=?";
                        			 PreparedStatement preparedStatement1 = connection.prepareStatement(member_query);
                      		        preparedStatement1.setString(1, member);
                      		        preparedStatement1.setString(2, mob_no);
                      		        int rowsAffected = preparedStatement1.executeUpdate();
                      		        System.out.println();
                      		        if (rowsAffected > 0) 
                      		        {
                      		      
                      		        	System.out.println("* Membership Revile success *");                             		        
                      		        } 
                      		        else 
                      		        {
                      		        	System.out.println("Wrong Mobile Number");
                      		        }               
                        		 }
                        		 catch (SQLException e)
                          	    {
                          	        e.printStackTrace();
                          	    }
                        		 
                        	 }     		 
                         }
                         else if(choice3==2)
                         {
                        	 System.out.println();
                        	 System.out.println("1. Reading");
                        	 System.out.println("2. BUY");              
                        	 System.out.println("3. Be a Member");
                        	 int choice6=scanner.nextInt();
                        	 switch(choice6)
                        	 {
                        	 case 1:
                        		 System.out.println();
                        		 System.out.println("* THESE ARE THE LIST OF BOOKS *");
                        		    String query = "SELECT * FROM books";
                        		    try{
                        		    	Statement sum=connection.createStatement();
                        		        ResultSet resultSet = sum.executeQuery("SELECT * FROM books");
                        		        while(resultSet.next())                      		       
                        		        System.out.println(resultSet.getString(1)+"| |"+resultSet.getString(3)+"| |"+resultSet.getString(5)+"| |"+resultSet.getString(7)+"| |"
                        		        		+resultSet.getString(9)+"| |"+resultSet.getString(11)+"| |"+resultSet.getString(13)+"| |");
                        		    }
                        		    catch (SQLException e)
                        		    {
                        		        e.printStackTrace();
                        		    }
                        		    Reading_book.reading();
                        		    break;
                        	 case 2:
                        		 Buying_Books.buy();
                        		 break;
                        	 case 3:
                        		 library_user.register();
                        		 break;
                        	 }
                        	 
                         }
                   
    	                
    	         }
            }
		}
		catch (SQLException e)
        {
            e.printStackTrace();
        }

}
}
