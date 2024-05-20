 public static int alternatingCharacters(String s) {
    // Write your code here
    int num=0;
        for (int a=0;a<s.length();a++){
            int temp=1;
            for (int b=a+1;b<s.length();b++){
               if (s.charAt(a)==s.charAt(b)){
                   num++;
                   temp++;
               }else {
                   break;
               }
            }
            a=a+temp-1;
        }
        return num;
    }
