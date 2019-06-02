/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author kahma
 */
public class Runner {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
                list.insert(38);
		list.insert(95);
		list.insert(112);
		list.insertAtStart(25);
		
		list.insertAt(1, 55);
		
		list.deleteAt(2);
		
		list.show();
	}

}

