import java.util.Scanner;

public class PoliceRecruiters {
    public void police (){
        Scanner sc = new Scanner(System.in);
        int numberOfEvents= sc.nextInt();
        int[] numbers= new int[numberOfEvents];
        int officers=0,crimes=0,unsolvedCrimes=0;
        for (int i =0; i<numberOfEvents;i++) {
        numbers[i]= sc.nextInt();
        }

        for (int i=0 ;i<numberOfEvents;i++) {
            if(numbers[i]==-1){
                if(officers<1){
                    unsolvedCrimes++;
                }
                else if(officers>0){
                    officers--;
                }
             } else if (numbers[i]>0) {
                officers += numbers[i];
            }
        }
        System.out.println(unsolvedCrimes);


    }
}
