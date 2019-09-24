/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MencariNilaiMax;

/**
 *
 * @author bangadam
 */
public class Main implements Statistik {
    public static void main(String[] args) {
        Main main = new Main();
        
        int data[] = {10,20,30,40,50};
                
        main.mencariRange(data);
    }

    @Override
    public void mencariRange(int[] data) {
        int max = 0, min = 1000, range;
        
        for (int i = 0; i <data.length; i++) {
            if (data[i] > max) {
                max = data[i];
            }
            
            if (data[i] < min) {
                min = data[i];
            }
        }
       
        range = (max-min);
         
        System.out.println("nilai range = "+ range);
    }
   
}
