import java.io.*;
class Student1
{
    private int rollno;
    private String name;
    private static int count = 0;

    public Student1()
    {
        this.rollno = 0;
        this.name = "unknown";
        count++;
    }


    public Student1(int rollno , String name)
    {
        this.rollno =rollno;
        this.name = name;
        count++;
    }

    @Override
    public String toString()
    {
        return "Student roll no:" + rollno +", Name :" + name;
    }
    public static int getCount() 
    {
        return count;
    }

}

public class student {
    public static void main(String[] args) 
    {
        try {
            int no, rno;
            String name;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("\nEnter number of students:");
            no = Integer.parseInt(br.readLine());
            Student1 obj[] = new Student1[no];

            for (int i = 0; i < no; i++) 
            {
                System.out.println("\nEnter roll number for student " + (i + 1) + ":");
                rno = Integer.parseInt(br.readLine());
                System.out.println("Enter name for student " + (i + 1) + ":");
                name = br.readLine();

                obj[i] = new Student1(rno, name);
                System.out.println("Created: " + obj[i].toString());
                System.out.println("Total students created so far: " + Student1.getCount());
            }

        } 
        catch (IOException e) 
        {
            System.out.println("Error reading input: " + e);
        }

    }
    
}





// define a class Student with attributes rollno and name .define default and parameterized constructor .override the toString() method .keep the count of object created . create objects using parameterized constructor and display the object count after each object is created