import java.util.Scanner;

public class Games {
    public void games(){
        Scanner sc = new Scanner(System.in);
        int teams = sc.nextInt(),guest=0;
        int[][] uniforms = new int[teams][2];
        for (int i =0;i< uniforms.length;i++) {
            for (int j=0; j<uniforms[i].length;j++) {
                uniforms[i][j]= sc.nextInt();
            }
        }
        for (int i =0;i<uniforms.length;i++) {
            for (int j=0;j< uniforms.length;j++) {
                if(uniforms[i][0]==uniforms[j][1]){
                    guest++;
                }
            }
        }
        for (int i =0;i<uniforms.length;i++) {
            for (int j=0;j< uniforms.length;j++) {
                if(uniforms[i][1]==uniforms[j][0]){
                    guest++;
                }
            }
        }
        System.out.println(guest);
       }
}
