import java.util.Scanner;

public class WrongSubtraction {
    public void subtract(){
        Scanner read = new Scanner(System.in);

        int number = read.nextInt();
        int subtractions = read.nextInt();

        for (int i=0 ; i<subtractions; i++){
         if(number % 10 == 0)
             number=number/10;
         else
             number--;

        }
        System.out.println( number);
    }
}
