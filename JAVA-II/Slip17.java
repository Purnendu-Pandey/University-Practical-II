/*
import java.util.Scanner;
import java.util.TreeSet; 
public class Slip17
{
       public static void main(String[] args)
       {
              Scanner scanner = new Scanner(System.in);
              TreeSet<Integer> integers = new TreeSet<>();
              
              System.out.println();
              System.out.println("Enter the number of integers : ");
              int n = scanner.nextInt();
              
              for (int i=0;i<n;i++)
              {
                   System.out.println("Enter integer "+(i+1)+" : ");
                   int integer = scanner.nextInt();
                   integers.add(integer);
              }
              
              System.out.println();
              System.out.println("The Sorted integers are : ");
              for (int integer : integers)
              {
                   System.out.println(integer);
              }
       }
}
*/

/* 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Slip17 extends JFrame 
{
    JTextField textField;
    JButton startBtn;
    public Slip17() 
    {
        setTitle("Number Display");
        setSize(450,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        textField = new JTextField(10);
        add(textField);

        startBtn = new JButton("Start");
        startBtn.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                startDisplay();
            }
        });
        add(startBtn);
        setVisible(true);
    }
    private void startDisplay()
    {
        Thread displayThread = new Thread(new DisplayRunnable());
        displayThread.start();
    }

    private class DisplayRunnable implements Runnable 
    {
        public void run()
        {
            for(int i=1; i<=100; i++) 
            {
                textField.setText(Integer.toString(i));
                try 
                {
                    Thread.sleep(100);
                } 
                catch (InterruptedException e) 
                {
                    System.out.println(e);
                }
            }
            textField.setText("");
        }
    }

    public static void main(String args[]) {
        new Slip17();
    }
}
*/
