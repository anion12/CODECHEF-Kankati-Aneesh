/*Search an element in an array
You are given an array A of size N and an element X. Your task is to find whether the array A contains the element 
X or not.*/

import java.io.*;
import java.util.*;

class Codechef {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//learnt this bufferedreader instead of using scanner
        
        
       
            String[] firstLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(firstLine[0]);
            int x = Integer.parseInt(firstLine[1]);
            
            String[] elements = br.readLine().trim().split(" ");
            boolean found = false;
            
            for (String s : elements) {
                if (Integer.parseInt(s) == x) {
                    found = true;
                    break;
                }
            }
            
            System.out.println(found ? "YES" : "NO");//learnt usage of ternary operator 
        
    }
}
