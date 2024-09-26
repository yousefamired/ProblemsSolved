import java.util.Scanner;

public class AntonAndLetters {
    public void anton(){
        Scanner scan = new Scanner(System.in);
        String set ="";
        int noOfLetters =0;
        set+=scan.nextLine();
        scan.close();
        for (int i=1; i<set.length();i++) {
            if(set.charAt(i) == '}' || set.charAt(i) == ' '||set.charAt(i) == ','){
                continue;
            }
            else
                noOfLetters++;
        }
        char[] letters = new char[noOfLetters];
        int counter=0;
        for (int i=0; i<set.length();i++) {
            if(set.charAt(i) == '}' || set.charAt(i) == ' '||set.charAt(i) == ','||set.charAt(i) == '{'){
                continue;
            }
            else{
               letters[counter] = set.charAt(i);
                counter++;}
        }
        int letterCounter = 1;
        boolean notFound = true;
        for (int i = 1 ; i<letters.length;i++) {
            notFound = true;
            for (int j = i - 1; j >= 0; j--) {
                if (letters[i] == letters[j]) {
                    notFound = false;
                }

            }
            if (notFound){
                letterCounter++;
            }
        }
        if (noOfLetters<1) {
            System.out.println(0);
        }
        else {
            System.out.println(letterCounter);
        }
    }
}