import java.util.Scanner;

public class StonesOnTheTable {
    public void stones(){
        Scanner sc = new Scanner(System.in);
        int numberOfStones = sc.nextInt(),removed=0;

        String stones =sc.next();;
                char stone='s';
        for (int i = 0; i<stones.length();i++){
            if (stones.charAt(i)==stone){
                removed++;
                stone=stones.charAt(i);
            }
            else
                stone=stones.charAt(i);
        }
        System.out.println(removed);
    }
}
