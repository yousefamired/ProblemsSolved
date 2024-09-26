import java.util.Scanner;

public class ShasAndOskols {
    public void shasAndOskols(){
        Scanner sc = new Scanner(System.in);
        int noOfWires = sc.nextInt();
        int[] wires = new int[noOfWires];
        for (int i=0;i<wires.length;i++) {
            wires[i] = sc.nextInt();
        }
        int birdsShooted = sc.nextInt();
        int[][] coordinates = new int[birdsShooted][2];
        for (int i = 0;i<coordinates.length;i++) {
            for (int j=0; j<coordinates[0].length;j++) {
                if(j==0){
                coordinates[i][j] = sc.nextInt()-1;
                }
                else {
                    coordinates[i][j] = sc.nextInt();
                }
            }
        }

        for (int i = 0;i<coordinates.length;i++) {
        if(coordinates[i][0]-1 != -1 && coordinates[i][0]+1 <noOfWires){
            wires[(coordinates[i][0])-1] += coordinates[i][1] -1;
            wires[(coordinates[i][0])+1] += wires[coordinates[i][0]] - coordinates[i][1] ;
            wires[coordinates[i][0]] =0;
        }
        else if(coordinates[i][0]-1 == -1  && coordinates[i][0]+1 <noOfWires){
            wires[(coordinates[i][0])+1] += wires[coordinates[i][0]] - coordinates[i][1];
            wires[coordinates[i][0]] =0;
        }
        else if(coordinates[i][0]-1 == -1  && coordinates[i][0]+1 >= noOfWires){

            wires[coordinates[i][0]] =0;
        }
        else {
            wires[(coordinates[i][0])-1] += coordinates[i][1] -1; ;
            wires[coordinates[i][0]] =0;
        }
        }
        for (int i = 0;i<wires.length;i++) {

            System.out.println(wires[i]);
        }

    }
}
//5
//10 10 10 10 10
//5
//2 5
//3 13
//2 12
//1 13
//4 6
//i=2
// wires [0] = 10   - - - - - - - - - -
// wires [1] = 14   - - - - - - - - - - - - - -
// wires [2] = 1   -
// wires [3] =    0
// wires [4] = 23   - - - - - - - - - - - - - - - - - - - - - - -
//  (0)(0) 2 (0)(1) 5
// (1)(0) 3 (1)(1) 13
// (2)(0) 2 (2)(1) 12
// (3)(0) 1 (3)(1) 13
// (4)(0) 4 (4)(1) 6

//5

//5
//co[1][1] = 2   co[1][2] = 5
//co[2][1] = 3   co[2][2] = 13
//co[3][1] = 5   co[3][2] = 12
//co[4][1] = 1   co[4][2] = 13
//co[5][1] = 4   co[5][2] = 6
