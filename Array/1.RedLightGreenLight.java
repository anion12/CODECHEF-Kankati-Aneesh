/* Red Light, Green Light
“You won’t get caught if you hide behind someone.”
Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.
Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, 
K. Many players saw this trick and also started hiding behind Ali.

Now, there are N players standing between Gi-Hun and Ali in a straight line, with the ith player having height Hi
Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight.
Note:

Line of sight is a straight line drawn between the topmost point of two objects. Ali is visible to Gi-Hun if nobody between them crosses this line.
Even if there are some players who have the same height as that of Gi-Hun and Ali, Ali will be visible in Gi-Hun's line of sight.
Gi-Hun and Ali have the same height.

Input Format
The first line of input contains a single integer T, denoting the number of test cases. The description of 
T test cases follows.
The first line of each test case contains two space-separated integers N and K, denoting the total number of players between Gi-Hun and Ali and the height of both of them respectively.
The second line of each test case contains N space-separated integers, denoting the heights of the players between Gi-Hun and Ali.

Output Format
For each test case, output in a single line the minimum number of players who need to get shot so that Ali is visible in Gi-Hun's line of sight.
*/

import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int count = 0;
            
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() > k) {//learnt this for decreasing space complexity from n to 1.
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close(); //learnt this for proper practice to close the resources that are used.
    }
}
