public class Nested_If {
    public static void main(String[] args) {
     /*String Weather="not raning";
     String time="late";
     if(Weather!="raning"){
         if(time=="early"){
             System.out.println("you good to go to park");
         }
         else{
             System.out.println("you cannot go to the park because it is too late park could be closed");
         }
     }
     else{
         System.out.println("you cannot go outside it is raining");
     }
      */
        // if-else-if

        int month=5;
        String season;
        if(month==12 || month==1 || month==2||month==3||month==4)
            season="Winter";
        else if(month==5 || month ==6 || month==7 || month==8)
            season="holidays";
        else if(month==9 || month ==10 || month==11 || month==12)
            season="raining";
        else
            season="not vaild";

        System.out.println(season);
    }
}




/*                                                  Notes
If this big condition is true, then look inside and check this smaller condition.
if it is raining and late I can not go to park
if it is not raining and not late I can go to park !!!!!


if inside and if block
 */
