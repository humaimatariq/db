/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbFinalProject;

/**
 *
 * @author Umaima Tariq
 */
 import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.applet.Main;
import java.sql.SQLException;
public class BbmainClass
{

  
	public static void main(String[] args)
	{
		Connection connection = null;
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/OnlineHouseHoldService",
				"root", "");
                        

			                 System.out.println("Connected");
		}
		catch (Exception exception) {
			System.out.println("failed"+exception);
                       
		}
	} // function ends
} // class ends

    

