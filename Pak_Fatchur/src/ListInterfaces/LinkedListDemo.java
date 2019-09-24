/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListInterfaces;

import java.util.Iterator;
import java.util.LinkedList;
 
public class LinkedListDemo {
 
      public static void main(String[] args) {
 
             System.out.println("LINKED LIST\n");
 
             LinkedList<String> turism = new LinkedList<String>();
             //add elements to LinkedList
             turism.add("JEMBATAN AMPERA");
             turism.add("BENTENG KUTO BESAK");
             turism.add("KAMBANG IWAK");
             turism.add("PUNTI KAYU");
             turism.add("AIR TERJUN BEDEGUM");
             turism.add("SUNGAI MUSI");
             
             System.out.println(turism.getLast());
             
             /*
              * Please note that primitive values can not be added into LinkedList
              * directly. They must be converted to their correspondingwrapper class.
             */
             //Check list empty or not
              if (turism.size()==0){
                System.out.println("Linked list is empty");
             }
             else{
                 System.out.println("Linked list size: " + turism.size());
             }
 
            // print LinkedList
            System.out.println("LinkedList contains : " + turism);
            //delete element list
            System.out.println("Delete the element!");
            System.out.println("Choose Delete of the element : " + turism.remove(4));
            System.out.println("The contents of array are " + turism);
            System.out.println("The size of linkedlist is "+ turism.size());
 
            turism.add(2, "DANAU JAKABARING");
            System.out.println("After inserting \"DANAU JAKABARING\", \nLinkedList contains : " + turism);
            // To get first element from Java LinkedList, use
            System.out.println("The First element of LinkedList is : " +turism.getFirst());
            // To get last element from Java LinkedList, use
            System.out.println("The Last element of LinkedList is : " +turism.getLast());
            System.out.println(); System.out.println();
            System.out.println("\nDisplay ArrayList Vertically by using Iterator");
            
            Iterator<String> iterator = turism.iterator();
             while(iterator.hasNext()){
                String element = (String) iterator.next();
                     System.out.println(element);
             }
 
      } //main
}