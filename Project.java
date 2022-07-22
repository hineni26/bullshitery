import java.util.*;
public class Project {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Hey, what's your name? ");
        String name=sc.nextLine();
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age<13) 
            System.out.println("You can't Login in any Social Media, " +name+".");
        else if(age>=13 && age <=18)
            System.out.println("You can't Login in any social media  without parental control, "+name+".");
        else if(age>=18)
            System.out.println("You can login into any Social media, "+name+".");
    }
}
