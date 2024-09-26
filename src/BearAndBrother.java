import java.util.Scanner;

public class BearAndBrother {
    public void bear(){
        Scanner sc = new Scanner(System.in);
        int limak = sc.nextInt();
        int bob = sc.nextInt();
        int years = 0;
        do{
            limak *=3;
            bob *=2;
            years++;

        }
        while (bob>=limak);
        System.out.println(years);

    }
}
