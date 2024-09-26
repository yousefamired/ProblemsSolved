import java.util.Scanner;
public class AntonAndDanik {
    public void antonAndDanik(){
       Scanner scan = new Scanner(System.in);
       int games = scan.nextInt();
       int anton=0;
       int danik = 0;
      // char[] wins = new char[games];
       String win = scan.next();
               for(int i=0; i<win.length();i++)
               {
                   if(win.charAt(i)=='A')
                   anton++;
                   else if(win.charAt(i)=='D')
                   danik++;
                   else System.out.println("please enter a valid name");

               }
               if (anton>danik)
                System.out.println("Anton");
               else if(danik>anton)
                 System.out.println("Danik");
               else
                System.out.println("Friendship");

  }
}
