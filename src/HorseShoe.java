import java.util.Scanner;

public class HorseShoe {
    public void horseShoe(){
        Scanner sc = new Scanner(System.in);
        int[] shoes = new int[4];
        int newShoe=0;
        for (int i=0;i<shoes.length;i++) {
            shoes[i]=sc.nextInt();
        }
        for (int i=0;i<shoes.length;i++){
            for (int j=i+1;j<shoes.length;j++) {
               if(shoes[i]==shoes[j]){
                    newShoe++;
                    break;
                }
            }
        }

        System.out.println(newShoe);
    }
}
