import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class SnackTower {
    public void snack(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] snacks = new int[size];
        for (int i=0; i<snacks.length;i++) {
            snacks[i] = sc.nextInt();
        }
        //4 3 5 2 1

        String other = "";
        int x= Arrays.stream(snacks).max().getAsInt();
        for (int i=0; i<snacks.length;i++) {
            if (snacks[i] == x) {
                System.out.print(snacks[i] + " " +other);
                snacks[i]=0;
                x= Arrays.stream(snacks).max().getAsInt();
            }
            else {
                other += snacks[i] +"";
                System.out.println();
            }

        }




    }
}
