class Arm {

    static void Armstrong(int x){

    int temp = 0;
        int rem;
    while(x != 0){

        rem = x % 10 ;

        temp =  temp + rem*rem*rem ;

        x = x / 10 ;


    }
        System.out.println(temp);
    }
       
    
    public static void main(String[] args) {
        
        int x = 153 ;

        Armstrong(x);

    }
}
