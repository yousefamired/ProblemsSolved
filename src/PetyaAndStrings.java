import java.util.Scanner;

public class PetyaAndStrings {
    public void petya() {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();

        String second = sc.next();
        int difference =first.toLowerCase().compareTo(second.toLowerCase());
        if (difference>0)
        System.out.println(1);
        else if (difference<0)
            System.out.println(-1);
        else
            System.out.println(0);

    }
}
