import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sjekker for parameter feil
        if (args.length > 1) {
            System.out.println("Error! Feil antall parametere.");
            return;
        }


        switch (args.length) {
            case 0:
                Scanner inputScanner = new Scanner(System.in);
                break;


            case 1:
                try {
                    Scanner fileScanner = new Scanner(new File(args[0]));

                    BinarySearchTree tre = new BinarySearchTree();
                    while (fileScanner.hasNext()) {
                        tre.insert( fileScanner.next() );
                    }

                }
                catch (FileNotFoundException e) {
                    System.out.println("Finner ikke fil");
                }
                break;
        }



    }
}
