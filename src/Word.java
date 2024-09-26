
import java.util.Scanner;

public class Word {
    public void word(){
        Scanner sc=new Scanner(System.in);

        String word= sc.next();
        String lowerCase= word.toLowerCase();
        String upperCase= word.toUpperCase();
        int valueOfWord=0,valueOfLower=0,valueOfUpper=0,lowDiff=0,upDiff=0;
        for (int i=0; i<word.length();i++){
            valueOfWord += word.charAt(i);
        }
        for (int i=0; i<lowerCase.length();i++){
            valueOfLower += lowerCase.charAt(i);
        }
        for (int i=0; i<upperCase.length();i++){
            valueOfUpper += upperCase.charAt(i);
        }

        lowDiff=valueOfLower-valueOfWord;
        upDiff= valueOfWord-valueOfUpper;

        if(upDiff<lowDiff){
            System.out.println(upperCase);}
        else {System.out.println(lowerCase);
        }
    }
}
