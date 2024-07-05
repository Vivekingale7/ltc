// check if number is prime number or not
 class PrimeNum {
  
        static int flag = 0 ;

    static int prime(int number){

        
        for(int i = 1 ; i < number ; i++){

            if(number % 1 == 0 && number % i == 0 ){

                    flag = 1 ;
            }
        }
        return flag;
    }
    


    public static void main(String[] args) {

        int number = 23 ;

        prime(number);

        if(flag == 1){

            System.out.println(number +" is prime number");
        }

    }
}
