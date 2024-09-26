import java.util.Scanner;

public class NewPassword {
    public void pass(){
        Scanner sc = new Scanner(System.in);
        int letters = sc.nextInt(),distinct = sc.nextInt();
        char[] distinction = new char[distinct];
        int counter=97,checker=0;
        for (int i = 0 ;i<distinction.length;i++) {
            distinction[i] = (char) counter;
            counter++;
        }

        String s="";

        do{
            s += distinction[checker];        // d =3  s=7
            checker++;
            if(checker ==distinct){
                checker=0;
            }
        }while(s.length() < letters);
        System.out.print(s);
    }
}
