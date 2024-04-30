package Java.String;

import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()){
            return false;
        }
        a=a.toLowerCase();
        b=b.toLowerCase();
        // Complete the function
        int [] arr1=new int[26];
        int [] arr2=new int[26];

        for(int c=0;c<a.length();c++){
            int count=a.charAt(c)-'a';
            arr1[count]++;

            int count1=b.charAt(c)-'a';
            arr2[count1]++;

        }

        for(int d=0;d<26;d++){
            if(arr1[d]!=arr2[d]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
