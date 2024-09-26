import java.util.Scanner;

public class Team {
    public void team(){
        Scanner sc = new Scanner(System.in);
        int problems = sc.nextInt();
        int[][] solution = new int[problems][3];
        int f,solved = 0;
        for (int i=0 ; i <solution.length;i++) {
            f=0;
            for (int j= 0;j<solution[i].length;j++) {
                solution[i][j] = sc.nextInt();
                f+=solution[i][j];
            }
            if(f>1)
                solved++;
        }

        System.out.println(solved);
    }
}
