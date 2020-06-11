/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayspractice;

/**
 *
 * @author johntomczak
 */
public class ArraysPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create the int array... break apart the pieces!
            // if we knew the values, could have done 'new int[]{1,2,3,4,5}'
        
        int[] iArr = new int[5];
        //ditto for a String array
        String[] sArr = new String[5];
        
        for( int i = 0; i < 5; i++ ){
            iArr[i] = i+1;
        }
        
        // may as well verify it for ourselves
//        for( int i = 0; i < 5; i++ ){
//            System.out.println( iArr[i] );
//        }
        
        for( int i = 0; i < 5; i++ ){
            sArr[i] = String.valueOf( iArr[i] );
        }
        
        for( int i = 0; i < 5; i++ ){
            // let's see what we have here...
            System.out.println( sArr[i] );
            // verify the data type... would that work for iArr? 
                // No, int is true primitive, unlike String (hybrid type)
            System.out.println( sArr[i].getClass().getName() );
        }
        
        // one last thing to note
            // so now, what is the last element's index, in terms of x?
        int x = iArr.length;
        System.out.println( "\n" + x );
        
    }
    
}
