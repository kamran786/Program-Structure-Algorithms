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
public class DynamicStackImplementation {

    /**
     * @param args the command line arguments
     */
    int capacity=2;
    int stack[] = new int[capacity];
    int top=0;
    public void push(int data)
    {
        if(size()==capacity)
            expand();

        stack[top]=data;
        top++;

    }
    private void expand()
    {
        int length=size();
        int dynamicstack[] = new int[capacity*2];
        System.arraycopy(stack, 0, dynamicstack, 0, length);
        stack=dynamicstack;
        capacity=capacity*2;
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
        shrink();
                }
        return data;
        
    }
    
    private void shrink()
    {
        int length = size();
        if(size()<(capacity/2)/2)
        {
            capacity=capacity/2;
            int dynamicstack[] = new int[capacity];
            System.arraycopy(stack, 0, dynamicstack, 0, length);
            stack= dynamicstack;
        }
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
            System.out.print(stack[i]+" ");

        }
        System.out.println(" ");

    }
}