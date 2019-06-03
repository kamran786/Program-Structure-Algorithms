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
public class QueueImplementation {

    int capacity=5;
    int queue[] = new int[capacity];
    int front;
    int rear;
    int size;
  
    public void enQueue(int data)
    {
        if(!isFull())
        {
        queue[rear]=data;
        rear=(rear+1)%capacity;
        size++;
        }
        else
        {
            System.out.println("Queue is Full.");
        }
    }
    
    public int deQueue()
    {
        int data= queue[front];
        if(!isEmpty())
        {
        front=(front+1)%capacity;
        size--;            
        }
        else
        {
            System.out.println("Queue is Empty.");
        }
       return data;
    }
    
    public int size()
    {
        return size;
    }
    
    public boolean isEmpty()
    {
        return size()==0;
    }
    
    public boolean isFull()
    {
        return size()==capacity;
    }
    public void show()
    {
        for(int i=0;i<size;i++)
        {
        System.out.print(queue[(front+i)%5]+" ");
        }
        System.out.println(" ");
    }
}
