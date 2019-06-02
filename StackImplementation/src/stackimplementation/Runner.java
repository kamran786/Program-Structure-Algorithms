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
public class Runner {
    
    
    public static void main(String[] args) {
        
//        StackImplementation stack = new StackImplementation();
//        System.out.println("Empty Status: "+stack.isEmpty());
//        stack.push(120);
//        stack.push(10);
//        stack.push(20);
//        stack.push(1120);
//        stack.push(-20);
//        stack.push(208);
//        stack.show();
//        System.out.println("Stack size: "+stack.size());
//        
//        System.out.println("Peek Data: "+stack.peek());
//
//        
//        stack.pop();
//        stack.show();
//        System.out.println("Empty Status: "+stack.isEmpty());
//        System.out.println("Stack size: "+stack.size());
//        System.out.println("Peek Data: "+stack.peek());
//
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.show();
//        System.out.println("Empty Status: "+stack.isEmpty());
//        stack.pop();
//        stack.show();
//        System.out.println("Empty Status: "+stack.isEmpty());
//        stack.pop();
        
        
        
        DynamicStackImplementation dstack = new DynamicStackImplementation();
        dstack.push(120);
        dstack.show();
        dstack.push(10);
        dstack.show();
        dstack.push(20);
        dstack.show();
        dstack.push(1120);
        dstack.show();
        dstack.push(-20);
        dstack.show();
        dstack.push(208);
        dstack.show();
        dstack.push(40);
        dstack.show();
        dstack.push(28);
        dstack.show();
        dstack.push(8);
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        dstack.pop();
        dstack.show();
        
    }
}
