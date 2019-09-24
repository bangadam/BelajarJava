/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListInterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author bangadam
 */
public class ListClientExample {
	// deklarasi Interface List
	private List list;

	// Constructor dari class ListClientExample
	public ListClientExample() {
	    list = new ArrayList();
//		list = new List();
	}
        
        // Memmbuat method dengan mendapatkan data dari List
	protected List getList() {

	    return list;

	}
        
	public static void main(String[] args) {
		ListClientExample ice = new ListClientExample();
		List list = ice.getList();
		System.out.println(list);
	}
}
