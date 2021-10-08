
package Pert1;
import java.util.*;
public class Opposite_Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
        0 10
0 7
1 6
        */
        while(sc.hasNext())
        {
            int a = sc.nextInt();
            if(a>10)
            {
                System.out.println("10 "+(a-10));
            }
            else{
                System.out.println("0 "+a);
            }
        }
    }
}
