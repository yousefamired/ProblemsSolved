import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SerejaAndDima {
    public void serejaAndDima(){
        Scanner sc = new Scanner(System.in);
        int noOfCards = sc.nextInt(),sereja=0,dima=0;
        int[] cards = new int[noOfCards];
        for (int i =0;i<cards.length;i++) {
            cards[i] = sc.nextInt();
        }
        for (int i=(cards.length-1);i>=0;i--) {
            if(cards[i]>cards[0]){
                sereja += cards[i];
            }
            else {
                sereja +=cards[0];
                //b   cards = ArrayUtils.remove(cards, 0);
            }
        }
        System.out.println(sereja);
}
}
