import java.util.Scanner;

public class cube {


        static int cubeOfnum ;

    static int cubeValue(int x){

         cubeOfnum = x*x*x;

        return cubeOfnum;
    }


    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the Value");
        int x = sc.nextInt();
        
        cubeValue(x);

        System.out.println(cubeOfnum);

    }
    
}
