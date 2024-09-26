import java.util.Scanner;

public class Magnets {
    public void magnets(){
        Scanner sc = new Scanner(System.in);
        int numberOfMagnets = sc.nextInt(),lastMagnet = 0,groups=0;
        int[] magnets = new int[numberOfMagnets];

        for (int i= 0 ; i< magnets.length;i++)
        {
            magnets[i]= sc.nextInt();
            if(magnets[i]== lastMagnet){

                lastMagnet=magnets[i];
            }
            else
            {
                groups++;
                lastMagnet=magnets[i];
            }
        }
        System.out.println(groups);

    }
}
