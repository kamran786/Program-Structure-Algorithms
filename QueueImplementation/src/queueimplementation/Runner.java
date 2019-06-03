/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueimplementation;

/**
 *
 * @author kahma
 */
public class Runner {
    
    public static void main(String[] args) {
        
        QueueImplementation queue = new QueueImplementation();
        queue.deQueue();
        queue.enQueue(23);
        queue.enQueue(34);
        queue.enQueue(3);
        System.out.println("Size: "+queue.size());
        queue.enQueue(4);
        queue.enQueue(6);
        System.out.println("Removed: "+queue.deQueue());
        queue.enQueue(62);
        queue.enQueue(60);
        System.out.println("Size: "+queue.size());
        queue.show();
    }
    
}
