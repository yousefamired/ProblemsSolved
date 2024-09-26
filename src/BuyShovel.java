import java.util.Scanner;

public class BuyShovel {
    public void buyShovel(){
        Scanner sc= new Scanner(System.in);
        int shovelPrice= sc.nextInt(),shovels=0,coins= sc.nextInt();
        int x=0;
        for (int i=1;i<10;i++) {
           x= shovelPrice*i;
           if((x-coins)%10==0){
               shovels=i;
               break;
            }else if(x%10 == 0){
               shovels=i;
               break;
           }
        }
        if(shovels==0){
            shovels=10;
        }
        System.out.println(shovels);
    }
}
