/*
import java.util.Scanner;
import java.util.TreeSet;
public class Slip16
{
    public static void main(String[] args) 
    {
       Scanner scanner = new Scanner(System.in);
       TreeSet<String> colors = new TreeSet<>();

       System.out.print("Enter the number of colors: ");
       int n = scanner.nextInt();

       for (int i=0;i< n; i++) 
       {
            System.out.print("Enter color: ");
            String color = scanner.next();
            colors.add(color);
       }

       System.out.println("Colors in the TreeSet:");
       for (String color : colors) 
       {
            System.out.println(color);
       }
    }
}
*/

/*
import java.sql.*;
public class TeacherDetails 
{
    public static void main(String[] args) 
    {
        try 
        {
            Connection connection =  DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32"");
            displayJavaTeachers(connection);

            connection.close();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }   
    private static void displayJavaTeachers(Connection connection) throws SQLException 
    {
        String selectQuery = "SELECT * FROM Teacher WHERE Subject = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(selectQuery);

        preparedStatement.setString(1, "JAVA");
        ResultSet resultSet = preparedStatement.executeQuery();

        // Display details of Java teachers
        System.out.println("Details of teachers teaching JAVA subject:");
        System.out.println("-------------------------------------------");
        while (resultSet.next()) 
        {
            int tNo = resultSet.getInt("TNo");
            String tName = resultSet.getString("TName");
            String subject = resultSet.getString("Subject");
            System.out.println("TNo: " + tNo + ", TName: " + tName + ", Subject: " + subject);
        }
    }
}
*/

