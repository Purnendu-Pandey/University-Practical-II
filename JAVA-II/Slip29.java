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


/*
import java.util.*;
public class Slip29
{
    public static void main(String[] args) 
    {
      List<Integer> l = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      
      int ch; 
      do 
      {
        System.out.println("Menu");
        System.out.println("1. Add elements at first position :");
        System.out.println("2. Delete last element");
        System.out.println("3. Display size of linklist");
        System.out.println("4. Exit");
            
        System.out.println("------------------------------");
        System.out.println("Enter your choice:");
        ch = sc.nextInt();
        System.out.println();
            
        switch(ch)
        {
          case 1: System.out.println("Enter a number:");
                    l.addFirst(sc.nextInt());
                    break;
          case 2: l.removeLast();
                    break;
          case 3: System.out.println("Size : " + l.size() + "\n" + l);
                    break;
                default: System.out.println("Exit Successfully");
            }
            System.out.println("-------------------------------");
        } while(ch != 4);
    }
}
*/
