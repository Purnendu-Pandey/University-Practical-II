/*
//create example folder in that - index.html
<a href="patient.jsp">patient</a><br><br>

//in example folder ->> patient.jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Display Patient Details</title>
</head>
<body>
    <h1>Patient Details</h1>
    <table border="1">
        <tr>
            <th>Patient Number</th>
            <th>Patient Name</th>
            <th>Patient Address</th>
            <th>Patient Age</th>
            <th>Patient Disease</th>
        </tr>
        <%@ page import="java.sql.*" %>
        <% 
            Connection conn = null;
            PreparedStatement stmt = null;
            ResultSet rs = null;
            try 
            {    
                // Database connection details
                String url = "jdbc:postgresql://192.168.1.254:5432/ty35";
                String username = "ty35";
                String password = "ty35";
                
                // Establish the database connection
                conn = DriverManager.getConnection(url, username, password);
                
                // SQL query to fetch patient details
                String sql = "SELECT * FROM patien";
                stmt = conn.prepareStatement(sql);
                rs = stmt.executeQuery();
                
                // Iterate over the result set and display patien details
                while (rs.next()) {
        %>
                    <tr>
                        <td><%= rs.getString("pno") %></td>
                        <td><%= rs.getString("pname") %></td>
                        <td><%= rs.getString("paddr") %></td>
                        <td><%= rs.getString("age") %></td>
                        <td><%= rs.getString("disease") %></td>
                    </tr>
        <% 
                }
            } catch (Exception e) 
            {
                e.printStackTrace();
            } 
            finally 
            {
                // Close JDBC objects in finally block
                try 
                {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                } 
                catch (SQLException e) 
                {
                    e.printStackTrace();
                }
            }
        %>
    </table>
</body>
</html>

now generate war* file in example folder itself
*/


/* 
import java.util.*;
public class Slip03
{
    public static void main(String[] args) 
    {
        LinkedList<String> names = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int ch;
        do 
        {
            System.out.println("Menu");
            System.out.println("1. Add element at the end of the list :");
            System.out.println("2. Delete first element of the list :");
            System.out.println("3. Display the contents of list in reverse order :");
            System.out.println("4. Exit");

            System.out.println("------------------------------");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (ch) 
            {
                case 1:
                    System.out.println("Enter Elements :");
                    names.addLast(sc.nextLine());
                    break;
                case 2:
                    names.removeFirst();
                    break;
                case 3:
                    Iterator it = names.descendingIterator();
                    while (it.hasNext()) 
                    {
                        System.out.println(it.next());
                    }
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println("-------------------------------");
        } while (ch != 4);
    }
}
*/