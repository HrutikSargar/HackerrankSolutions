package Java.String;

import java.util.Scanner;

/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , print Yes if it is a palindrome, print No otherwise.

Constraints

 will consist at most  lower case english letters.
Sample Input

madam
Sample Output

Yes

*/
public class String_Reverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String temp="";
        for(int a=A.length()-1;a>=0;a--){
            temp+=A.charAt(a);
        }
        if(temp.equals(A)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}
