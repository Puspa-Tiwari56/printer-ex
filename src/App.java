import java.util.Scanner;
        public class  App {
            public static void main(String[] args) throws Exception { 
                Scanner in = new Scanner(System.in);
                System.out.println("What is your favourite place?");
                String name = in.nextLine();;



                if(name.equals(""))
                {
                    System.out.println("Error");

                }
                    else
            {

                    String Nepal = "Nepal";
            
                System.err.println("My favourite place is " + Nepal + ".");
            }}

        }