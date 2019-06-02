/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackimplementation;

/**
 *
 * @author kahma
 */
public class StackImplementation {

    /**
     * @param args the command line arguments
     */
    int stack[] = new int[5];
    int top=0;
    public void push(int data)
    {
        if(size()==5)
        {
            System.out.println("Stack is full");
        }
        else
        {
        stack[top]=data;
        top++;          
        }

    }
    
    public int pop()
    {
        int data=0;
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
        top--;
        data= stack[top];
        stack[top]=0;
                }
        return data;
        
    }
    
    
    public int peek()
    {
        int data;
        data=stack[top-1];
        return data;
    }
 
    
    public int size()
    {
        return top;
    }
    
    public boolean isEmpty()
    {
        return top<=0;
    }
    public void show()
    {
        for(int i=0;i<stack.length;i++)
        {
            System.out.println(stack[i]+" ");

        }

    }
}