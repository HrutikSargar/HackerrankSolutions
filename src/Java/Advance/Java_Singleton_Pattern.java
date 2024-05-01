package Java.Advance;
/*
Complete the Singleton class in your editor which contains the following components:

A private Singleton non parameterized constructor.
A public String instance variable named .
Write a static method named getSingleInstance that returns the single instance of the Singleton class.
Once submitted, our hidden Solution class will check your code by taking a String as input and then using your Singleton class to print a line.

Input Format

You will not be handling any input in this challenge.

Output Format

You will not be producing any output in this challenge.

Sample Input

hello world
Sample Output

Hello I am a singleton! Let me say hello world to you

*/
import java.util.*;
class Singleton{
    private static Singleton instance=null;
    public String str;
    private Singleton(){
        str="Hello I am a singleton!";
    }
    public static Singleton getSingleInstance(){
        if(instance==null){
            instance=new Singleton();
            return instance;
        }
        return null;
    }
}
public class Java_Singleton_Pattern {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        Singleton single=Singleton.getSingleInstance();
        System.out.println(single.str+" Let me say "+s1+ " to you");
    }
}