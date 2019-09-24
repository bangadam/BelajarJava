/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListInterfaces;

import java.util.ArrayList;
import java.util.Iterator;
 
public class ArrayListDemo {
 
       public static void main(String[] args) {
 
       /* ARRAY LIST */
       // create an array list
       ArrayList <String> turism = new ArrayList <String>();
       System.out.println("Initial size of turism list \t\t : " + turism.size());
 
       // add elements to the array list
       turism.add("WISATA SUNGAI MUSI");
       turism.add("KAMBANG IWAK");
       turism.add("BENTENG KUTO BESAK");
       turism.add("PUNTI KAYU");
       turism.add("MASJID AGUNG");
       turism.add("GUNUNG DEMPO");
      
       
 
//       // display the array list
       System.out.println("Contents of turism list \t\t : " + turism);
// 
//       // Add an element into index=1
       turism.add(3, "PULAU KEMARO");
       System.out.println("\"PULAU KEMARO\" was inserted \t\t\t : " + turism);
       System.out.println("Size of turism list now \t\t : " + turism.size());
       turism.add("JEMBATAN AMPERA");
       turism.add("AIR TERJUN BEDEGUM");
       turism.add("DANAU RANAU");
       turism.add("DANAU JAKABARING");
 
       // IndexOf
       System.out.println("The index of \"E\" \t\t\t : " + turism.indexOf("E"));
       // Checking if an element is included to the list
       boolean item = turism.contains("TAMAN SEMBILANG");
       System.out.println("ArrayList contains TAMAN SEMBILANG ? \t : " + item);
 
       // Getting the element in a specific position
       String getItem = (String) turism.get(4);
       System.out.println("The item in index 4 is \t\t\t : " + getItem);
       // Checking if array list is empty
       boolean check = turism.isEmpty();
       System.out.println("Arraylist is empty ? \t\t\t : " + check);
 
       // Remove elements from the array list
       turism.remove("PULAU KEMARO");
       System.out.println("Delete element of \"PULAU KEMARO\"\t\t : " + turism);
       System.out.println("Size of turism list now \t\t : " + turism.size());
       turism.remove(6); // index
       System.out.println("Delete the 7th item \t\t\t : " + turism);
       System.out.println("Size of turism list now \t\t : " + turism.size());
       turism.remove(turism.size()-1); // remove the last element
       System.out.println("Delete the last item \t\t\t : " + turism);
       System.out.println("Size of turism list now \t\t : " + turism.size());
 
       System.out.println(turism.indexOf(5));
       
       // display ArrayList vertically
       System.out.println("------------------oOo--------------------");
       System.out.println("Display ArrayList Vertically by using For");
          for(int i=0; i<turism.size(); i++){
              System.out.println(turism.get(i));
       } 
           
 
       // clear
             turism.clear();
       System.out.println("\nContents of turism list \t\t : " + turism);
 
       } //main
}
