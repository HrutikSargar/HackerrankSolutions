package Java.String;

import java.util.Scanner;

public class validUsername {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String [] usernames=new String [n];
        for(int a=0;a<n;a++){
            usernames[a]=sc.next();
        }

        for(int b=0;b<usernames.length;b++){
            if(  (usernames[b].charAt(0)<65 && usernames[b].charAt(0)>90)  ||  (usernames[b].charAt(0)<97 && usernames[b].charAt(0)>122) || usernames[b].length() <8 || (usernames[b].startsWith("_")) || (usernames[b].startsWith("1"))|| (usernames[b].startsWith("2")) || (usernames[b].startsWith("3")) || (usernames[b].startsWith("4")) || (usernames[b].startsWith("5")) || (usernames[b].startsWith("6")) || (usernames[b].startsWith("7")) || (usernames[b].startsWith("8")) || (usernames[b].startsWith("9")) || (usernames[b].startsWith("0")) || usernames[b].contains("?") ){
                System.out.println("Invalid");
            }
            else {
                System.out.println("Valid");
            }
        }
    }
}
