import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // sjekker for parameter feil
        if (args.length > 1) {
            System.out.println("Error! Parameter skal være en filplassering eller 0 parametere.");
            return;
        }


        switch (args.length) {
            // Standard input
            case 0:
                BinarySearchTree tre = new BinarySearchTree();

                Scanner inputScanner = new Scanner(System.in);
                inputScanner.useDelimiter("[^a-zæøåA-ZÆØÅ]");

                System.out.println("Skriv teksten som skal ordtelles her. Avslutt teksten med ordet tekstFerdig.\n");

                while (inputScanner.hasNext()) {
                    String word = inputScanner.next();
                    if (word.equals("tekstFerdig")) {
                        break;
                    }
                    tre.insert( word.toUpperCase() );
                }

                System.out.println();
                tre.printInorder();

                break;

            // leser fra fil
            case 1:
                try {
                    Scanner fileScanner = new Scanner(new File(args[0]));
                    fileScanner.useDelimiter("[^a-zæøåA-ZÆØÅ]");

                    BinarySearchTree tree = new BinarySearchTree();
                    while (fileScanner.hasNext()) {
                        tree.insert( fileScanner.next().toUpperCase() );
                    }

                    tree.printInorder();

                }
                catch (FileNotFoundException e) {
                    System.out.println("Finner ikke fil");
                }

                break;
        }


    }
}
