import java.util.Scanner;

public class LinelandMail {
    public void mail(){
        Scanner sc = new Scanner(System.in);
        int coor = sc.nextInt();
        int max=0;
        int[] residents = new int[coor];
        int[] distance = new int[coor];
        for (int i = 0 ;i<residents.length;i++) {
            residents[i] = sc.nextInt();
        }//1 3 5 7
        for (int i = 0 ;i<residents.length;i++) {
            for (int j = 0 ;j<residents.length;j++) {
                 if(Math.pow(residents[i]-residents[j],2) > Math.pow(max,2))
                max = (int)Math.pow(residents[i]-residents[j],2);
            }
            distance[i] = (int)Math.sqrt(max);
            max =0;
            System.out.println(distance[i]);
        }

    }
}
