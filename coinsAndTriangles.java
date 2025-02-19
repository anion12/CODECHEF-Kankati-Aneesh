/*Problem Link:https://www.codechef.com/problems/TRICOIN
Coins And Triangle
Read problems statements in Mandarin Chinese , Russian and Vietnamese as well.
Chef belongs to a very rich family which owns many gold mines. Today, he brought N gold coins and decided to form a triangle using these coins. Isn't it strange?

Chef has a unusual way of forming a triangle using gold coins, which is described as follows:

He puts 1 coin in the 1st row.
then puts 2 coins in the 2nd row.
then puts 3 coins in the 3rd row.
and so on as shown in the given figure.
1461147954-8b9f4b7d27-A.png
Chef is interested in forming a triangle with maximum possible height using at most N coins. Can you tell him the maximum possible height of the triangle?

Input
The first line of input contains a single integer T denoting the number of test cases.

The first and the only line of each test case contains an integer N denoting the number of gold coins Chef has.

Output
For each test case, output a single line containing an integer corresponding to the maximum possible height of the triangle that Chef can get.*/


import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            int low = 0, high = n, ans = 0;

            while (low <= high)
            {
                int mid = low + (high - low) / 2;
                long sum = (long) mid * (mid + 1) / 2;

                if (sum <= n)
                {
                    ans = mid;  
                    low = mid + 1;  
                }
                else
                {
                    high = mid - 1;  
                }
            }
            
            System.out.println(ans);
        }
      sc.close();

    }
}

