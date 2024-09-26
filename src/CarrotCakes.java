import java.util.Scanner;

public class CarrotCakes {
    public void cakes(){
        Scanner sc = new Scanner(System.in);
        int reqCakes= sc.nextInt(), bakingTime= sc.nextInt(),
                ovenCapacity = sc.nextInt(), buildTime = sc.nextInt();

        int noOfBakes = (int)Math.ceil((double)reqCakes / ovenCapacity);
        int totalTimeWithoutBuilding = noOfBakes * bakingTime;
        int timerOne=0,timerTwo=buildTime;
        int totalTime=0;
        int i = 0;
            while(true){
            if(i == 0){
                timerOne = i+bakingTime;
                reqCakes -=  ovenCapacity;
            }
            if(i == timerOne){
                timerOne = i+bakingTime;
                reqCakes -= ovenCapacity;
            }
            if(i == buildTime){
                reqCakes -= ovenCapacity;
                timerTwo = i +bakingTime;
            }
            if(i == timerTwo){
                timerTwo = i+bakingTime;
                reqCakes -= ovenCapacity;
            }
            if(reqCakes<1){
                totalTime = i + bakingTime;
                break;
            }
            i++;
        }

       if(totalTimeWithoutBuilding <= totalTime)
           System.out.println("NO");
       else
           System.out.println("YES");


       }
    }

