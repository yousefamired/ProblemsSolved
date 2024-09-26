import java.util.Scanner;

public class ColorfulStones {
    public void stones(){
        Scanner sc = new Scanner(System.in);
        String values = sc.next(), instructions = sc.next();
        int position =0;
        for (int i = 0 ; i<instructions.length();i++){
            if(values.charAt(position)==instructions.charAt(i)){
                position++;
            }
        }
        System.out.println(position+1);
    }
}
