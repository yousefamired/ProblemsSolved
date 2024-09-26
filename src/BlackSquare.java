import java.util.Scanner;

public class BlackSquare {
    public void blackSquare(){
        Scanner sc = new Scanner(System.in);
        int[]calories = new int[4];
        int totalCal=0;
        for (int i = 0; i<4; i++)
            calories[i]=sc.nextInt();
        String caloriesReq = sc.next();
        for (int i=0;i<caloriesReq.length();i++)
        totalCal += calories[Character.getNumericValue(caloriesReq.charAt(i))-1];


        System.out.println(totalCal);


    }
}
