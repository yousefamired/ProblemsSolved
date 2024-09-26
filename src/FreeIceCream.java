import java.util.Scanner;

public class FreeIceCream {
    public void icecream(){
        Scanner sc = new Scanner(System.in);
        int noOfSigns = sc.nextInt();
        long icecreams = sc.nextInt() , depressedBoys =0;
        char[] signs = new char[noOfSigns];
        for (int i=0; i<signs.length;i++){
            signs[i] = sc.next().charAt(0);
            if (signs[i] == '+'){
                long ice = sc.nextInt();
                icecreams+= ice;
            }
            if(signs[i] == '-'){
                long ice= sc.nextInt();
                if(icecreams >= ice){
                    icecreams -= ice;
                }else{
                    depressedBoys ++;
                }
            }
        }


            System.out.println(icecreams +" "+ (int)depressedBoys);

    }
}
