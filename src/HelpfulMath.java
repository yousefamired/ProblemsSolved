import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMath {
    public void help(){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int size = 0;
        if(s.length() == 1){
             size = 1;
        }else{
             size = (int)Math.ceil(s.length()/2.0);
        }
        int[] numbers = new int[size];
        int counter=0;
        String arranged;
        for (int i = 0;i<s.length();i++) {
            if(s.charAt(i)== '+'){}
            else{
                numbers[counter] = Character.getNumericValue(s.charAt(i));
                counter++;
            }
        }
        Arrays.sort(numbers);
        for (int i=0; i<numbers.length;i++) {
            if(i == numbers.length-1)
                System.out.print(numbers[i]);
            else
            System.out.print(numbers[i] +"+");
        }


    }
}
