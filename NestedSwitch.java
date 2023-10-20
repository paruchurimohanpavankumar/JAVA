public class NestedSwitch {
        public static void main(String[] args) {
            String c="USA";
            String s="california";
            switch(c){
                case "USA":
                    System.out.println("Great so your from "+c);
                    switch (s){
                        case "california":
                            System.out.println(s+" is not eligible for this scheme");
                            break;
                        case "texas":
                            System.out.println("This scheme depends on your credit history");
                            break;
                    }
                    break;
                case "russia":
                    System.out.println("hi");
                    break;
                default :
                    System.out.println("enter the correct one");
                    break;
            }

        }
    }
