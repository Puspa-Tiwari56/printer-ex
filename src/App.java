import java.util.Scanner;
        public class  App {
            public static void main(String[] args) throws Exception { 
                Scanner in = new Scanner(System.in);
                System.out.println("What is your name?");
                String name = in.nextLine();;



                if(name.equals(""))
                {
                    System.out.println("Error");

                }
                    else
            {
                System.err.println("Our name is " + name + ".");
            }}

        }