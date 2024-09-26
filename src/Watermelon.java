import java.util.Scanner;

    public class Watermelon {

        public void waterMelon(){
            Scanner read = new Scanner (System.in);
            int weight = read.nextInt();
            if(weight%2 == 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }

        }


