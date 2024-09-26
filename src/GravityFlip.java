import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip {
    public void gravity(){
        Scanner sc = new Scanner(System.in);
        int coloumns = sc.nextInt();

        int[] box = new int[coloumns];
        for (int i = 0; i< box.length;i++){
            box[i] = sc.nextInt();
        }
        Arrays.sort(box);
        for (int i=0;i< box.length;i++) {
            System.out.println(box[i]+" ");
        }
    }
}
