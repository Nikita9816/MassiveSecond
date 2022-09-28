/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massivesecond;



/**
 *
 * @author pupil
 */
public class MassiveSecond {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] msv = new int[5][];
        


        msv[0] = new int[3];
        msv[1] = new int[5];
        msv[2] = new int[7];
        msv[3] = new int[8];
        msv[4] = new int[9];
     

        for (int a = 0; a < msv.length; a++){
            for (int j=0;j < msv[a].length;j++){
                msv[a][j] = ((int)(Math.random()*50)+50);
                System.out.print(" " + msv[a][j] + " ");
        }
        System.out.println("");
        }
        
            
        
    }
}
                
            
                
            
        
    


      
                
            
        
        
        
        
    
    

