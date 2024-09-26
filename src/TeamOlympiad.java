import java.util.Scanner;

public class TeamOlympiad {
    public void olumpics(){
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int[] students = new int[numberOfStudents];
        int programmers=0,pe=0,maths=0;
        for (int i= 0 ; i<students.length;i++) {
            students[i] = sc.nextInt();
            switch (students[i])
            {   case 1 : programmers++;
                break;
                case 2 : maths++;
                break;
                case 3 : pe++;
                break;
            }
        }
        //1 3 1 3 2 1 2
        int least = Math.min(programmers,maths);
        least = Math.min(least,pe);

        int[][] teams = new int[least][3];

        for (int i = 0 ; i< teams.length;i++) {
            for (int j=0; j<teams[0].length; j++){
                for (int x=0; x<students.length;x++) {//7
                                                    //  1 3 1 3 2 1 2
                    if(students[x] == 1 && j == 0){           // 1
                        teams[i][j] = x;
                        students[x]=10;
                        break;
                    }
                    else if(students[x] == 2  && j==1 ){
                        teams[i][j] = x;
                        students[x]=10;
                        break;
                    }
                    else if(students[x]==3 && j ==2){
                        teams[i][j] = x;
                        students[x]=10;
                        break;
                    }
                }
            }
        }

        if(least == 0){
            System.out.print(0);
        }
        else
            System.out.println(least);
        for (int i = 0 ; i< teams.length;i++) {
            for (int j=0; j<teams[0].length; j++){
                System.out.print(teams[i][j] +1+" ");
            }
            System.out.println();
        }
    }
}
