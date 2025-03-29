/*
import java.util.*;
public class Slip02 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter total number of friends: ");
        int n = sc.nextInt();
        sc.nextLine();
        HashSet<String> friendsSet = new HashSet<String>();

        for(int i=0; i<n; i++) 
        {
            System.out.print("\nEnter the name of friend " + (i+1) + ": ");
            String name = sc.nextLine();
            friendsSet.add(name);
        }
        ArrayList<String> sortedFriendsList = new ArrayList<String>(friendsSet);
        Collections.sort(sortedFriendsList);
        System.out.println("\n Sorted friend's list in ascending order:");
        for(String friend : sortedFriendsList) 
            System.out.println(friend);
        sc.close();
    }
}
*/

/*
//create example folder in that -> index.html
<a href="ReqInfo">ServerInfo</a><br><br>

//In WEB-INF folder ->web.xml
<web-app>
<servlet>
<servlet-name>ReqInfo</servlet-name>
<servlet-class>ReqInfo</servlet-class>
</servlet>
<servlet-mapping>
 <servlet-name>ReqInfo</servlet-name>
 <url-pattern>/ReqInfo/*</url-pattern>
</servlet-mapping>

//in classes folder -> ReqInfo.java
import java.io.*;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class  ReqInfo extends HttpServlet
{
 
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
   {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String[] Sname = getServletContext().getServletRegistrations().keySet().toArray(new String[0]);
        
        out.println("<html>");
        out.println("<head>Servlet Program</head>");
        out.println("<body>");
        out.println("<h1>Client Information</h1>");
        out.println("<p>IP Address :"+request.getRemoteAddr()+"</p>");
        out.println("<p>Browser Type :"+request.getHeader("User-Agent")+"</p>");
        out.pri ntln("<h1>Server Information</h1>");
        out.println("<p>Server OS :"+System.getProperty("os.name")+"</p>");
        out.println("<p>Server Information :"+getServletContext().getServerInfo()+"</p>");
        out.println("<h2>Loaded Servlet</h2>");
        out.println("<ul>");
        for (String sname : Sname)
        {
        	out.println("<li>"+sname+"</li>");
        }
        out.println("</ul>");
        out.println("</body>");
        out.println("</html>");
   }
}
*/