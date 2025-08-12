// package Emplyoee name;
import java.io.*;
import java.util.*;
import java.util.concurrent.ExecutionException;

class InvalidName extends ExecutionException
{
    InvalidName(String msg)
    {
        super(msg);
    }
}



public class index {
    String name,str;
    char ch;
    int j,flag = 0, flags = 0,flagss = 0;
    DataInputStream din = new DataInputStream(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    public void userExce()
    {
        try
        {
            System.out.print("Enter the Employee Nmae :");
            str = br.readLine();
            name = str;





            for(int j =0 ; j<name.length(); j++)
            {
                ch = (char)name.charAt(j);

                if(Character.isDigit(ch))
                {
                    
                    System.out.println(ch);
                    flags = 1;

                }
                
                if(Character.isLetter(ch))
                {
                    

                }
                else
                {
                    flag = 1;
                }
                if(Character.isSpaceChar(ch))
                {
                     flagss += 1;
                }

            }

           

            if(flag== 1)
            {
                if(flags == 1)
                {
                     throw new InvalidName("name is Invalid");
                // throws userdefined exception for invalid name input form  user
                }
            }
            else
            {
                System.out.println("Name = " +name);
                        System.out.println(flag);

            }
        }
        //closing of try Block
        catch(InvalidName z)
        {
            System.out.println(z.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) 
    {
        index n1 =new index();
        n1.userExce();
        
    }
}
