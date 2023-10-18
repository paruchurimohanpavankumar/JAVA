import java.util.Scanner;
public class While{
    static int i=1;
    static int j=20;
    static int sum=0;
    public static void main(String[] args) {
      /*  while(++i<--j){
            System.out.println(i);
            System.out.println(j);
        //////////////////////////////////////////////////////////
        while(i<30){
            i=i+2;
            i++;
            System.out.println(i);
       //////////////////////////////////////////////////////////

        print 20 numbers and at the end do sum of all numbers
        while(i<21){
            sum+=i;
            i++;
        }
        System.out.println(sum);
      ////////////////////////////////////////////////////////////

        Scanner sc=new Scanner(System.in);
        while(true){
            String Name=sc.nextLine();
            if(Name.equalsIgnoreCase("end")){
                break;
            }

        }
        System.out.println("try to learn more name hahahah!!!!");
        /////////////////////////////////////////////////////////////////
       */
        Scanner sc=new Scanner(System.in);
        int a;
        int count=0;
        int total;
        while(true){
            System.out.println("enter a number");
            a=sc.nextInt();
            if(a<0){
                break;
            }
            count++;
            sum=sum+a;

        }
        System.out.println(sum);
        System.out.println(count);
        total=sum/count;
        System.out.println(total);
        if(total<=45){
            System.out.println("FAIL");
        }
        else if (total>=45&&total<=60) {
            System.out.println("above average");
        }
        else if(total>=60&&total<=75){
            System.out.println("average");
        }
        else if (total>=75&&total<=100){
            System.out.println("top marks");
        }
        else{
            System.out.println("whats wrong with you");
        }
        }
    }

/* i=10,j=20
11<19 //true
12<18 //true
13<17 //true
14<16 //true
15<15 //false  if we print the i value the value will change to 15
 */