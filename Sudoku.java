public class Sudoku {
    public static void main(String[] args) {
        Sudoku sudoku = new Sudoku();
        sudoku.afficher();
        
        
    }
    
    //Initialisation du tableau
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
    private boolean verifLigne(int ligne, int valeurs, int tableau[][]){
        //Verification de la ligne
        for (int i = 0; i < 9; i++){
            if (tableau[ligne][i] == valeurs){
                return false;
            }
        }
        return true;
    }
    private boolean verifCol(int colone, int valeurs, int tableau[][]){
        //verif colone 
        for(int k = 0; k<9; k++){
            if(tableau[k][colone] == valeurs){
                return false;
            }

        }
        return true;
    }
    private boolean verifBox(int colone, int valeurs, int tableau[][]){
        //verif box 3x3
        int boxCol = colone % 3;
        int boxLigne = colone % 3;
        for(int i = boxLigne * 3; i < boxLigne * 3 + 3; i++){
            for(int k = boxCol * 3; k < boxCol * 3 + 3; k++){
                if(tableau[i][k] == valeurs){
                    return false;
                }
            }
        }
        return true;
        


    }

    



}

