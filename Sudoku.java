import java.util.Vector;


public class Sudoku {
    
    private int tailleGrille =9;
   
    
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
                if (k % 3 == 0 && k != 0 ) {
                    System.out.print("| "); 
                }
                System.out.print(tableau[i][k]+" ");
            }
            System.out.println();
            if (i % 3 == 2) {
                System.out.println("---------------------");  
            }
        }
    
    }
    private boolean verifLigne(int ligne, int valeurs, int tableau[][]){
        //Verification si le nombre existe dans la ligne
        for (int i = 0; i < tailleGrille; i++){
            if (tableau[ligne][i] == valeurs){
                return true;
            }
        }
        return false;
    }
    private boolean verifCol(int colone, int valeurs, int tableau[][]){
        //verifie si le nombre existe dans la colone 
        for(int k = 0; k<tailleGrille; k++){
            if(tableau[k][colone] == valeurs){
                return true;
            }

        }
        return false;
    }
    private boolean verifBox(int colone, int valeurs, int tableau[][]){
        //verifie si le nombre existe dans les bpx 3x3
        int boxCol = colone % 3;
        int boxLigne = colone % 3;
        for(int i = boxLigne * 3; i < boxLigne * 3 + 3; i++){
            for(int k = boxCol * 3; k < boxCol * 3 + 3; k++){
                if(tableau[i][k] == valeurs){
                    return true;
                }
            }
        }
        return false;

    }
   

    public boolean isValid(int tableau [][], int col, int num, int row){
        for(int i =0; i<tailleGrille; i++){
            if (tableau[row][i]== num || tableau[i][col]== num) {
                return false;
            }
        }
        int boxRow = (row/3)*3;
        int boxCol = (col/3)*3;
        for(int i =0; i < 3 ; i++){
            for(int j =0; j<3; j++){
                if (tableau[boxRow+i][boxCol+j]== num){
                    return false;
                }
            }
        }
     return true; 

    }
    public boolean solveSudoku(int tableau[][]){
        for(int rows = 0; rows<tailleGrille;rows++){
            for(int cols =0; cols<tailleGrille;cols++){
                if(tableau[rows][cols]== 0){
                    for(int num =1; num <= tailleGrille; num++){
                        if (isValid(tableau, cols, num, rows)) {
                            tableau[rows][cols]= num;
                            if (solveSudoku(tableau)) {
                                return true;
                                
                            }
                            tableau[cols][rows]= 0;
                        }
                    }
                }
                return false;
            }   

        } 
        return true;
    }
}



    
