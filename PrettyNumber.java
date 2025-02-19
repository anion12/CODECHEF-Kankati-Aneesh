//(Link to the problem):https://www.codechef.com/problems/NUM239

/*Vasya likes the number 239
239. Therefore, he considers a number pretty if its last digit is 2, 3 or 9.
Vasya wants to watch the numbers between L and R (both inclusive), so he asked you to determine how many pretty numbers are in this range. Can you help him?
Input
The first line of the input contains a single integer 
T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains two space-separated integers L and R.
  
Output
For each test case, print a single line containing one integer — the number of pretty numbers between L and R.

Constraints
1≤T≤100
1≤L≤R≤10^5
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- >0)
		{
		    int l = sc.nextInt();
		    int r = sc.nextInt();
		     int count = 0;
		    for(int i = l;i<r+1;i++)
		    {
		      
		        if(i%10 == 2 || i%10==3 || i%10==9)
		        {
		            count++;
		        }
		        
		    }
		    
		    System.out.println(count);
		}

	}
}
 


