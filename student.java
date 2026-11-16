import java.util.*;
class student
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        String name = sc.nextLine();
        System.out.println("Enter you marks");
        int marks = sc.nextInt();
        if (marks>=90){
            System.out.println("pass");

        }
        else{
            System.out.println("fail");
        }

    }
}