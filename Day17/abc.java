/*
 * F  E   D 
 * C  B
 * A
 */

 import java.util.* ;

class ABC {

    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        
        

        char ch =(char) (64 +(rows*(rows + 1))/2);

      //  ch = ch + rows ;       
        for(int i = rows ; i > 0 ; i-- ){
            for(int j = 0 ; j < i ; j++){

                    System.out.print(ch + " ");
                    ch--;
            }
            System.err.println();
          }

          sc.close();
    }
    
}
