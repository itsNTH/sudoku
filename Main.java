import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    //variables et Object
        Sudoku sudoku = new Sudoku();
        Scanner scanner = new Scanner(System.in);
       
        String menue = "";
        System.out.println("veuillez choisir l'option de votre choix.\n 1-résoudre un sudoku");
        menue = scanner.nextLine();
        

        switch (menue) {
            case "1":
                sudoku.afficher();
                System.out.println("Voici le sudoku a résoudre.");
                break;
            case "2":

            default:
            System.out.println("L'option choisi n'est pas disponible.");
                break;
        }
        


        
        
        
    }
}    