public class Play {
    public static void main(String[] args) {
        /* positive or negative or zero
        int a=0;
        if(a>0){
            System.out.println("this is a positive number");
        }
        else if(a<0){
            System.out.println("this is a negative number");
        }
        else{
            System.out.println("it is zero");
        }
         */
        // leap year
        int year=1992;
        if(year%4==0) {
            if (year % 400 == 0 || year % 100 != 0) {
                System.out.println("its a leap year");
            } else {
                System.out.println("not a leap year");
            }
        }
        else{
                System.out.println("not a leap year what");
            }

    }
}
