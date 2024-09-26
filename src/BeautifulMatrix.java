import java.util.Scanner;

public class BeautifulMatrix
{
    public void beautiful() {
        Scanner sc = new Scanner(System.in);
        int[][] numbers = new int[5][5];
        int rows = 0;
        int coloumns = 0;
        int moves=0;
        for (int i=0 ; i <numbers.length;i++)
        {
            for (int j= 0;j<numbers[i].length;j++)
            {
                numbers[i][j] = sc.nextInt();
            }
        }

        for (int i=0 ; i <numbers.length;i++)
        {
            for (int j= 0;j<numbers[i].length;j++)
            {
                if(numbers[i][j] == 1){
                    rows= i;
                    coloumns = j;
                }
            }
        }
        while(rows !=2)
        {
            numbers[rows][coloumns] =0;
         if(rows>2)  {
             rows--;
             moves++;
         } else if (rows<2) {
             rows++;
             moves++;
         }
            numbers[rows][coloumns] =1;
        }
        while(coloumns !=2)
        {
            numbers[rows][coloumns] =0;
            if(coloumns>2)  {
                coloumns--;
                moves++;

            } else if (coloumns<2) {
                coloumns++;
                moves++;
            }
            numbers[rows][coloumns] =1;
        }

        System.out.println(moves );
    }
}
