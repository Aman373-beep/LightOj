
package Pert1;
import java.io.*;
import java.util.*;
public class Lift {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        int test = cs.nextInt();
        for(int i =1;i<=test;i++)
        {
            int a = cs.nextInt(); int b = cs.nextInt();
            int res = Math.abs(b-a);
            int p1 = (res*4) +11;
            int p2 = ((a)*4)+8;
            int finale = p1+p2;
        
            System.out.println("Case "+i+":"+" "+finale);
            
        }
    }
}
