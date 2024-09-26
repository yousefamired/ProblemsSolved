import java.util.Scanner;

public class WayTooLongWords {
    public void way(){
        Scanner sc = new Scanner(System.in);
        int strings = sc.nextInt(),counter;
        char first,last;
        String[] words = new String[strings];
        for (int i=0; i<words.length;i++) {
            words[i]= sc.next();
            if(words[i].length()>10){
                first = words[i].charAt(0);
                last = words[i].charAt(words[i].length()-1);
                counter = words[i].length()-2;
                words[i] = first+""+counter+""+last;
            }
        }
        for (int i=0; i<words.length;i++) {
            System.out.println(words[i]);
        }
    }
}
