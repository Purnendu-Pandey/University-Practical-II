/*
//create example folder in that -> index.html
<a href="cust">ServerInfo</a><br><br>

//In WEB-INF folder ->web.xml
<servlet>
<servlet-name>cust</servlet-name>
<servlet-class>cust</servlet-class>
</servlet>
<servlet-mapping>
 <servlet-name>cust</servlet-name>
 <url-pattern>/cust/*</url-pattern>
</servlet-mapping>


//in classes folder -> cust.java
import java.io.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class cust extends HttpServlet 
{
    private static final String JDBC_URL = "jdbc:postgresql://192.168.1.254:5432/ty35";
    private static final String JDBC_USER = "ty35";
    private static final String JDBC_PASSWORD = "ty35";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String customerNumber = request.getParameter("customerNumber");

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            
            String sql = "SELECT * FROM customer WHERE cno = ?";
            pstmt = conn.prepareStatement(sql);
            int c=Integer.parseInt(customerNumber);
            pstmt.setInt(1, c);
         
            rs = pstmt.executeQuery();

            if (rs.next()) 
            {
                int customerNo = rs.getInt("cno");
                String customerName = rs.getString("cname");
                String customerCity = rs.getString("city");
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h2>Customer Details</h2>");
                out.println("<p>" + customerNo + "</p>");
                out.println("<p>" + customerName + "</p>");
                out.println("<p>" + customerCity + "</p>");  
            } 
            else 
            {
                // If customer details not found, return an error message
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();
                out.println("<h2>Error</h2>");
                out.println("<p>Customer not found.</p>");
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();        } 
        finally {
           
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

//create table customer(cno int,cname varchar(20),city varchar(20));
//insert into customer(cno,cname,city)values(1,'sankalp','dhule');
//select * from customer;
*/

/*
import java.sql.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Slip11
{
    public static void main(String[] args)throws SQLException 
    {
        Connection con;
        Statement stmt;
        ResultSet rs;
        try 
        {
            Class.forName("com.postgresql.Driver");
            con = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32");
            if (con==null)
            {
                System.out.println("Connection failed..");
            }
            else
            {
                stmt=con.createStatement();
                rs=stmt.executeQuery("select * from Donor");

                ResultSetMetaData rsmd=rs.getMetaData();
                int no=rsmd.getColumnCount();

                for (int i=0;i<no;++i){
                    System.out.println("Column no : "+i);
                    System.out.println("Column name : "+rsmd.getColumnName(i));
                    System.out.println("Column type : "+rsmd.getColumnType(i));
                    System.out.println("Column Display size : "+rsmd.getColumnDisplaySize(i));
               }
                con.close();
            }
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            e.printStackTrace();
        }
    }   
}
//create table Donor(Dno int,Dname varchar(20),Daddress varchar(20));
//insert into Donor(Dno,Dname,Daddress)values(1,'manas','cidco');
//select * from Donor;
*/