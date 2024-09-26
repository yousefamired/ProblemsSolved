import java.util.Scanner;

public class BoyOrGirl {
    public void boyOrGirl(){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String temp = "";
int count=0;
        for (int i = 0 ;i<name.length();i++) {

            if (temp.contains(String.valueOf(name.charAt(i)))) {}
            else{
                temp+= name.charAt(i);
                count++;
            }
        }
        if(count %2 ==0)
System.out.println("CHAT WITH HER!");
else System.out.println("IGNORE HIM!");
    }
}
