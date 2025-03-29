/*
import java.awt.*;
import java.awt.event.*;
class Slip04 extends Frame implements Runnable
{
    Thread t;
    Label l1;
    int f;
    Slip04()
    {
        t=new Thread(this);
        t.start();
        setLayout(null);
        l1=new Label("Hello JAVA");
        l1.setBounds(100,100,100,40);
        add(l1);
        setSize(300,300);
        setVisible(true);
        f=0;
    }
    public void run()
    {
    try
        {
          if(f==0)
          {
              t.sleep(200);
              l1.setText("");
              f=1;
          }
          if(f==1)
          {
              t.sleep(200);
              l1.setText("Hello Java");
              f=0;
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        run();
    }
    public static void main(String a[])
    {
      new Slip04();
    }
}
*/


/*
import java.util.*;
public class Slip04
{
    public static void main(String[] args) 
    {
        Map<String, String> cityMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        
        int ch;
        String code, city;
        do
        {
            System.out.println("Menu");
            System.out.println("1. Add City and std code.(no duplicates)");
            System.out.println("2. Remove City.");
            System.out.println("3. Search city name dsiplay std code");
            System.out.println("4. Exit");
            
            System.out.println("------------------------------");
            System.out.println("Enter your choice:");
            ch = sc.nextInt();
            sc.nextLine();
            System.out.println();
            
            switch(ch) 
            {
                case 1: System.out.println("Enter std code.");
                    code = sc.nextLine();
                    System.out.println("Enter City.");
                    city = sc.nextLine();
                    cityMap.put(code, city);
                    break;
                case 2: System.out.println("Enter std code.");
                    code = sc.nextLine();
                    cityMap.remove(code);
                    break;
                case 3: System.out.println("Enter city:");
                    city = sc.nextLine();
                    code = null;
                    for(Map.Entry<String, String> map : cityMap.entrySet()) 
                    {
                        if(map.getValue().equals(city))
                            code = map.getKey();
                    }
                    if(code != null)
                        System.out.println("Code is " + code);
                    else
                        System.out.println("Not found.");
                    break;
                default: System.out.println("Invalid choice.");
            }
            System.out.println("-------------------------------");
        } while(ch != 4);
    }
}
*/