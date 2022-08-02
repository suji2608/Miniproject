import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class book {
	public Connection getconn()
	{
	Connection con = null;
	try
	{
	String url= "jdbc:mysql://localhost:3306/prodapt";
	String username="root";
	String password="root";
	con = DriverManager.getConnection(url,username,password);
	}
	catch(Exception e)
	{
	e.printStackTrace();
	}
	return con;
	}


	Scanner sc1 = new Scanner(System.in);



	public void bike1() throws SQLException {
			System.out.println("***Please enter User details***");
			 Connection con = getconn();
			 String s1 = "insert into bike1(name,address,phonenumber,booked_at,boardingtime_at) values(?,?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter phonenumber:");
			             String phonenumber =sc1.nextLine();
			             System.out.println("Enter booked date:");
			             String booked_at = sc1.nextLine();
			             System.out.println("Enter boarding time:");
			             String boardingtime_at = sc1.nextLine();
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,phonenumber);
			       stmt.setString(4, booked_at);
			       stmt.setString(5, boardingtime_at );
			       int a = stmt.executeUpdate();
			       System.out.println("***Slot booked***");
			       
		
	}

	public void auto1() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into auto1(name,address,phonenumber,booked_at,boardingtime_at) values(?,?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter phonenumber:");
		             String number =sc1.nextLine();
		             System.out.println("Enter bookingdate");
		             String booked_at = sc1.nextLine();
		             System.out.println("Enter boardingtime");
		             String boardingtime_at = sc1.nextLine();
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,number);
		       stmt.setString(4, booked_at);
               stmt.setString(5, boardingtime_at );
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		
	}

	public void car1() throws SQLException {
			System.out.println("***Please enter your details***");
			 Connection con = getconn();
			 String s1 = "insert into car1(name,address,phonenumber,boardingtime_at,booked_at) values(?,?,?,?,?)";
			 PreparedStatement stmt = con.prepareStatement(s1);

			             System.out.println("Enter  Name:");
			             String name =sc1.nextLine();
			             System.out.println("Enter address:");
			             String address =sc1.nextLine();
			             System.out.println("Enter phonenumber:");
			             String number =sc1.nextLine();
			             System.out.println("Enter boarding time");
			             String booked_at=sc1.nextLine();
			             System.out.println("Enter booking date");
			             String boardingtime_at  = sc1.nextLine();
			            
			       stmt.setString(1,name);
			       stmt.setString(2,address);
			       stmt.setString(3,number);
			       stmt.setString(4, booked_at);
			       stmt.setString(5, boardingtime_at );
			       int a = stmt.executeUpdate();
			       System.out.println("***Slot booked***");
			
		}
	public void bus1() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into bus1(name,address,phonenumber,boardingtime_at,booked_at) values(?,?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter  Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter phonenumber:");
		             String number =sc1.nextLine();
		             System.out.println("Enter boarding time");
		             String booked_at=sc1.nextLine();
		             System.out.println("Enter booking date");
		             String boardingtime_at  = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,number);
		       stmt.setString(4, booked_at);
		       stmt.setString(5, boardingtime_at );
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		
	}
	public void minibus1() throws SQLException {
		System.out.println("***Please enter your details***");
		 Connection con = getconn();
		 String s1 = "insert into minibus1(name,address,phonenumber,boardingtime_at,booked_at) values(?,?,?,?,?)";
		 PreparedStatement stmt = con.prepareStatement(s1);

		             System.out.println("Enter  Name:");
		             String name =sc1.nextLine();
		             System.out.println("Enter address:");
		             String address =sc1.nextLine();
		             System.out.println("Enter phonenumber:");
		             String number =sc1.nextLine();
		             System.out.println("Enter boarding time");
		             String booked_at=sc1.nextLine();
		             System.out.println("Enter booking date");
		             String boardingtime_at  = sc1.nextLine();
		            
		       stmt.setString(1,name);
		       stmt.setString(2,address);
		       stmt.setString(3,number);
		       stmt.setString(4, booked_at);
		       stmt.setString(5, boardingtime_at );
		       int a = stmt.executeUpdate();
		       System.out.println("***Slot booked***");
		
	}


	
}
