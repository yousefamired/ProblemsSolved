import java.util.Scanner;

public class VanyaAndFence {
    public void VanyaAndFence(){
        Scanner input = new Scanner(System.in);
        int friends = input.nextInt();
        int fenceHeight = input.nextInt();
        int width = 0 ;
        int[] tall =new int[friends];
        for (int i = 0; i<tall.length;i++)
        {
            tall[i] = input.nextInt();
            if (tall[i] > fenceHeight) {
                width += 2;
            } else {
                width += 1;
            }
        }

        System.out.println(width);





    }
}
