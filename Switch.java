public class Switch {
    public static void main(String[] args) {
       /* int number=300;
        switch(number){
            case 100:
                System.out.println("the value is equal to 100");
                break;
            case 200:
                System.out.println("the value is equal to 200");
                break;
            case 300:
                System.out.println("the value is equal to 300");
                break;
            default:
                System.out.println("the value should be in between 100-300");
        }*/
        String name = "Ashok Kurapati";
        String grads[] = {"A", "B", "C", "D"};
        switch (name) {
            case "mohan pavan":
                System.out.println("Student name: " + name);
                System.out.println("grads: " + grads[1]);
                break;
            case "Samba anna":
                System.out.println("Student name: " + name);
                System.out.println("grads: " + grads[0]);
                break;
            case "lalith":
                System.out.println("Student name: " + name);
                System.out.println("grads: " + grads[0]);
                break;
            case "Ashok Kurapati":
                System.out.println("Student name: " + name);
                System.out.println("grads: " + grads[1]);
                break;

            default:
                System.out.println("no student found");
                break;

        }



    }
}



/*
                                       Notes
               Switch Statement in java is a multiway Branch Statement and alternative of if-else-if
               Syntax:
               Switch(expression){
                case Vaue 1:
                  //statement sequence
                  break;
                case Value 2:
                  //Statement Sequence
                  break;
                  .
                  .
                  .
                case value N:
                  //Statement Sequence
                  break;
                default:
                 //default statement sequence
             }
    Expression much reslove with the types byte,short,int, char or enumerate

 */