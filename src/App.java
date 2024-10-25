import java.util.Scanner;
        public class  App {
            public static void main(String[] args) throws Exception { 
                Scanner in = new Scanner(System.in);
                System.out.println("What is your age?");
                String name = in.nextLine();;



                if(name.equals(""))
                {
                    System.out.println("Error");

                }
                    else
            {
                System.err.println("My age is " + 25 + ".");
            }}

        }