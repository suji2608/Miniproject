
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Hashtable;
//import java.util.Scanner;
public class Mini_Project {
public static void main(String[] args) throws IOException,SQLException {
	String s="y";
	System.out.println("...Welcome to the Tacab Services...");
	System.out.println("Choose Admin (or) Newuser (or) Customer..!!");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String A=br.readLine();
	if(A.equals("Admin")) {
	System.out.println("Enter Admin Username: ");
	String Adminusername=br.readLine();
	System.out.println("Enter Admin Password: ");
	String Adminpassword=br.readLine();
	if(Adminusername.equals("Sujimuthu")&& Adminpassword.equals("Suji12345")) {
		System.out.println("Successfully Logged in as Admin..");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		Statement stmt=(Statement) con.createStatement();
		System.out.println("Choose what you want to display: bike1 (or) auto1 (or) car1 (or) bus1 (or) minibus1");
		String B=br.readLine();
		if(B.equals("bike1")) {
		ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from bike1");
		while(rs.next()){
		System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5));
		}
		}
		if(B.equals("auto1")) {
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from auto1");
			while(rs.next()){
			System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5));
			}
			}
		if(B.equals("car1")) {
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from car1");
			while(rs.next()){
			System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5));
			}
			}
		if(B.equals("bus1")) {
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from bus1");
			while(rs.next()){
			System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5));
			}
			}
		if(B.equals("minibus1")) {
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from minibus1");
			while(rs.next()){
			System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4)+":"+rs.getString(5));
			}
			}
	}
	else {
		System.out.println("Username or password is incorrect.Try Again...");
	}
	}
	 if(A.equals("Newuser")) {
		System.out.println("Create a new login Details..");
		System.out.println("Firt Name: ");
		String fname=br.readLine();
		System.out.println("Second Name: ");
		String sname=br.readLine();
		System.out.println("Enter New Password: ");
		String pass=br.readLine();
		System.out.println("Re-Enter New Password: ");
		String pass1=br.readLine();
		
		if(pass.equals(pass1)) {
			System.out.println("Your Authentication is succesfull..");
			System.out.println("SERVICES PROVIDED BY US");
			System.out.println("press 1 to choose BIKE");
			System.out.println("press 2 to choose CAR");
			System.out.println("press 3 to choose AUTO");
			System.out.println("press 4 to choose MINIBUS");
	        System.out.println("press 5 to choose BUS");
		}else {
			System.out.println("Password Mismatched. So recreate a password..");
			System.out.println("Enter New Password: ");
			String pass2=br.readLine();
			System.out.println("Re-Enter New Password: ");
			String pass3=br.readLine();
			if(pass2.equals(pass3)) {
				System.out.println("Username and Password Succesfully created..");
				System.out.println("SERVICES PROVIDED BY US");
				System.out.println("press 1 to choose BIKE");
				System.out.println("press 2 to choose CAR");
				System.out.println("press 3 to choose AUTO");
				System.out.println("press 4 to choose MINIBUS");
		        System.out.println("press 5 to choose BUS");
	}
		}
	 }
	 if(A.equals("Customer")) {
	       Hashtable<String ,String> h1=new Hashtable<>();
	       h1.put("Suji","Suji2000");
	       h1.put("Sasi","Sasi0801");
	       h1.put("Daksh","Daksh1207");
	       h1.put("Hems","Hems1992");
	       h1.put("Muthu","Muthu6789");
	       System.out.println("...Start booking and Enjoy your Ride...");
	       System.out.println("Enter your login Credentials:");
	       System.out.println("Enter username: ");
	       String username=br.readLine();
	       System.out.println("Enter Password: ");
	       String password=br.readLine();
	if(h1.containsKey(username)) {
		if(h1.get(username).equals(password)) {
			System.out.println("Sucessfully logged in..");
			System.out.println("SERVICES PROVIDED BY US");
			System.out.println("press 1 to choose BIKE");
			System.out.println("press 2 to choose CAR");
			System.out.println("press 3 to choose AUTO");
			System.out.println("press 4 to choose MINIBUS");
	        System.out.println("press 5 to choose BUS");
		}else {
			System.out.println("Username or Password is incorrect");
				}
			}
		}
	while(s.equals("y")) {
   BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
	int i=Integer.parseInt(br.readLine());
    book bb = new book();

	switch (i) {
	case 1: 
		bb.bike1();
		break;
	case 2:
		bb.auto1();
	    break;
	case 3: 
		bb.car1();
	    break;
	case 4: 
		bb.bus1();
	    break;
	case 5: 
		bb.minibus1();
	    break;
	    
	default : 
		System.out.println("Wrong Choice");
		
	    break;
}

	System.out.println("Do you want to continue Booking. Press y/n");
	 s=br1.readLine();
if(s.equals("n")) {
	System.out.println("We will be waiting for your Ride again with us...");
	System.out.println("...Thankyou for taking a ride with us...");
	System.out.println("...Please give us feedback in our page once you completed your ride...");
}

}
}
	}





	
