import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);

        String partyAfil = "";


        System.out.println("Enter your party affiliation [RDI]: ");

        {
            partyAfil = console.nextLine();
        }
        if (partyAfil.equalsIgnoreCase("R")) {
            System.out.println("You get a Republician Elephant!!");
        }
        else if (partyAfil.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democrat Donkey!!");
        }
        else if (partyAfil.equalsIgnoreCase("I"))
        {
            System.out.println("You get an independent man!!");
       }
        else
            System.out.println("I don't know what party you are in, rerun the program...");
    }
}
