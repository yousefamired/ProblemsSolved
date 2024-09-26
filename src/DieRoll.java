import java.util.Scanner;

public class DieRoll {
    public void dieRoll() {
        Scanner sc = new Scanner(System.in);
        int  max = 0, yakko = sc.nextInt(), wakko = sc.nextInt();
        String prob="";
        max = Math.max(yakko, wakko);

        switch (max) {
            case 1: prob= 1+"/"+1;
            break;
            case 2: prob= 5+"/"+6;
                break;
            case 3: prob= 2+"/"+3;
                break;
            case 4: prob= 1+"/"+2;
                break;
            case 5: prob= 1+"/"+3;
                break;
            case 6: prob= 1+"/"+6;
                break;
        }
        System.out.println(prob);
}
}
