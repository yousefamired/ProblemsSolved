import java.util.Scanner;

public class TheBrothers {

    public void theBrothers(){
    Scanner read = new Scanner(System.in);

    String firstName = read.nextLine();
    String secondName= read.nextLine();

    String[] lastName1 = firstName.split(" ");
    String[] lastName2 = secondName.split(" ");

       // System.out.println(" 1 =  " +lastName1[1] +"-- 2  = "+lastName2[1]);

    if(lastName1[1].equals(lastName2[1]))
        System.out.println("ARE Brothers");
    else
        System.out.println("NOT");

}}
