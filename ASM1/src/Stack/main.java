/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stack;

/**
 *
 * @author trung
 */
public class main {
   public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println(stack.pop()); // Output: 20
        System.out.println(stack.peek()); // Output: 10
        System.out.println(stack.isEmpty()); // Output: false
   }
}
