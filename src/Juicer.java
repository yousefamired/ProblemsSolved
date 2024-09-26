import java.util.Scanner;

public class Juicer {
    public void juicer(){
        Scanner sc = new Scanner(System.in);

        int orangeSize = sc.nextInt(), maxSize = sc.nextInt(), maxWaste = sc.nextInt(), wasteSection=0, noOfEmptying=0;
        int[] oranges = new int[orangeSize];
        for (int i = 0 ; i<oranges.length; i++) {
            oranges[i] = sc.nextInt();
            if(oranges[i]<= maxSize){
                wasteSection+= oranges[i];
                if(wasteSection>maxWaste){
                    wasteSection=0;
                    noOfEmptying++;
                }
            }
        }
        System.out.println(noOfEmptying);

}
}
