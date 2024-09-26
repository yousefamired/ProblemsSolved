import java.util.Scanner;

public class ShortSort {
    public void shortSort(){
        Scanner read = new Scanner(System.in);
        int noOfTests = read.nextInt();
        String[] tests =new String[noOfTests];
        for(int i = 0 ; i<noOfTests; i++){
        tests[i]= read.nextLine();
        }
        for(int count=0; count<noOfTests; count++){
        char[] test =tests[count].toCharArray();
        int[] sort= new int[3];
        for (int i=0 ; i<5; i++){
        sort[i] = test[i];
        }
        int temp= 0, counter=0;
        for (int i = 0 ; i<3; i++){

            for (int j = i+1 ; j<3; j++){
            if(sort[i] > sort[j]){
                temp = sort[i];
                sort[i] = sort[j];
                sort[j] = temp;
                counter ++;
            }
            }
        }
        if (counter<2)
        System.out.println("yes");
        else
        System.out.println("NO");
    }
    }
}

