/*
import java.sql.*;
public class Slip13 
{
    public static void main(String[] args) 
    {
        try 
        {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://192.168.1.254/ty32","ty32","t32");
            DatabaseMetaData metaData = connection.getMetaData();

            System.out.println("Database Product Name: " + metaData.getDatabaseProductName());
            System.out.println("Database Product Version: " + metaData.getDatabaseProductVersion());
            System.out.println("Driver Name: " + metaData.getDriverName());
            System.out.println("Driver Version: " + metaData.getDriverVersion());

            ResultSet tables = metaData.getTables(null, null, null, new String[]{"TABLE"});
            System.out.println("\nTables in the database:");
            while (tables.next()) 
            {
                String tableName = tables.getString("TABLE_NAME");
                System.out.println(tableName);
            }
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    }
}
*/

/*
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

class ThreadLifeCycle extends Thread 
{
    private String threadName;
    
    ThreadLifeCycle(String threadName) 
    {
        this.threadName = threadName;
    }  
    public void run() 
    {
        Random rand = new Random();
        int sTime = rand.nextInt(5000);
        System.out.println(threadName + " is created.");
        System.out.println("Sleep time of " + threadName + " is: " + sTime + "ms.");
        try {
            Thread.sleep(sTime);
        } catch (InterruptedException ex) 
        {
            Logger.getLogger(ThreadLifeCycle.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println(threadName + " is dead.");
    }
}

public class Slip13
{
    public static void main(String[] args) 
    {
        ThreadLifeCycle t1 = new ThreadLifeCycle("First");
        ThreadLifeCycle t2 = new ThreadLifeCycle("Second");
        ThreadLifeCycle t3 = new ThreadLifeCycle("Third");       
        t1.start();
        t2.start();
        t3.start();
    }
}
*/
