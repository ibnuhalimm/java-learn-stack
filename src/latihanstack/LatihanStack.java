/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanstack;

/**
 *
 * @author dev
 */

import java.util.Stack;

public class LatihanStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        Stack<Character> s3 = new Stack<>();
        
        s1.push('D');
        s1.push('A');
        s1.push('T');
        s1.push('A');
        
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        
        while (!s2.empty()) {
            s3.push(s2.pop());
        }
        
        while (!s3.empty()) {
            System.out.print(s3.pop());
        }
        
        System.out.println();
    }
    
}
