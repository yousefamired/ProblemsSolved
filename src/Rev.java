import java.util.Scanner;

public class Rev {
    public void boyOrGirl(){
        Scanner read = new Scanner(System.in);
        String username = read.next();
        int length = username.length(); //diana = 5
        for (int i = 0 ; i<username.length() ; i++) //i=1 , length = 5
        {
            for(int j=i+1; j< username.length() ; j++) {// i=1,j=2  (0d,1i,a2,n3,a4)
                if (username.charAt(i) == username.charAt(j)){//i=i j=
                    length--;
                break;}
            }
        }

        if(length % 2 == 0 )
            System.out.printf("even %s",length);
        else
            System.out.printf("Odd %s",length );


    }
}
