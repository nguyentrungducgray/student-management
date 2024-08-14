/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asm1;

/**
 *
 * @author trung
 */
public class ASM1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.peek()); // Output: 10
        System.out.println(stack.isEmpty()); // Output: false
        
        
        
        
    }
    
}
