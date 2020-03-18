/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixdeger;

/**
 *
 * @author Asus
 */
public class MatrixDeger {

    
    public static void main(String[] args) {
        int [][][] matrix = new int [3][3][3];
        int [][][] matrix2 = new int [3][3][3];
        int [][][] matrixc = new int [3][3][3];
        for (int i = 0; i<matrix.length; i++){
            
            for (int j = 0; j<matrix.length; j++) {
                
                for (int k = 0; k<matrix.length; k++){
                    
                   matrix [i][j][k] = i*j*k;
                }
            }
            
        }
        
        for (int i = 0; i<matrix2.length; i++){
            
            for(int j = 0; j<matrix2.length; j++){
                
                for(int k = 0; k<matrix2.length; k++){
                    
                    matrix2 [i] [j] [k] = i+j+k;
                }
            }
        }
        
        System.out.println("Matrixler dolduruldu");
        
        for (int i = 0; i<matrixc.length; i++ ){
            
            for (int j = 0; j<matrixc.length; j++){
                
                for(int k = 0; k<matrixc.length; k++){
                    int toplam = 0;
                    for(int l = 0; l<matrixc.length; l++){
                    toplam += matrix [i][j][k] * matrix2 [k][j][i];
                    }
                    matrixc [i][j][k] =toplam;
                }
                
            }
        }
        
        System.out.println("matrixler dolduruldu");
        
        for (int i = 0; i<matrix2.length; i++){
            
            for(int j = 0; j<matrix2.length; j++){
                
                for(int k = 0; k<matrix2.length; k++){
                    
                    System.out.println(matrix2 [i] [j] [k]);
                }
                System.out.println("");
            }
        }
        
    }
    
}
