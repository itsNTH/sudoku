public class Sudoku {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.afficher();
        
        
    }

    public int[][] tableau ={
        {0, 0, 0, 0, 0, 0, 0, 0, 0},
        {9, 0, 0, 0, 0, 0, 0, 0, 0},
        {0, 8, 0, 0, 0, 0, 0, 0, 0},
        {0, 0, 7, 0, 0, 0, 0, 0, 0},
        {0, 0, 0, 6, 0, 0, 0, 0, 0},
        {0, 0, 0, 0, 5, 0, 0, 0, 0},
        {0, 0, 0, 0, 0, 4, 0, 0, 0},
        {0, 0, 0, 0, 0, 0, 3, 0, 0},
        {0, 0, 0, 0, 0, 0, 0, 2, 0}
    };
    public void afficher(){
        //Affichage du tableau
      for(int i = 0; i < 9; i++){
        for (int k = 0; k < 9; k++){
            if (k % 3 == 0 && k != 0) {
                System.out.print("| ");
                
            }
            
            System.out.print(tableau[i][k]+" ");
            if (i % 3 == 2 && i != 0 && k == 8) {
                System.out.println();
                System.out.println("---------------------");
                
            }
        }
        System.out.println();
    }
    
}
}


