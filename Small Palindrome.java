/*Small Palindrome
Chef has X ones (1s) and Y twos (2s) in his collection. He wants to arrange all of them into the smallest possible palindrome number using all of these ones (1s) and twos (2s).
Help Chef with the answer.

Note: X and Y
Y are both even numbers.
 A palindromic number is a number that remains the same when its digits are reversed.

Input Format
The first line of input will contain a single integer T, denoting the number of test cases.
The first and only line of each test case will contain two space-separated integers X and Y — the amount of ones (1s) and twos (2s) respectively.
  
Output Format
For each test case, output on a new line the smallest possible palindrome number using 
X ones (1s) and 
Y twos (2s).

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); 

        while (T-- > 0) {
            int x = sc.nextInt();  
            int y = sc.nextInt();  
            
            StringBuilder firstHalf = new StringBuilder();
            
           
            for (int i = 0; i < x / 2; i++) {
                firstHalf.append('1');
            }
           
            for (int i = 0; i < y / 2; i++) {
                firstHalf.append('2');
            }
            
      
            String palindrome = firstHalf.toString() + firstHalf.reverse().toString();
            System.out.println(palindrome);
        }
        
		    
		     
		}
	
}


