public static String pangrams(String s) {
    // Write your code here
       s=s.toLowerCase();
        char [] data=s.toCharArray();
        int [] res=new int[26];

        for (int a=0;a<data.length;a++){
            if (data[a]==' '){
                continue;
            }
            ++res[data[a]-97];

        }
        for (int a=0;a<res.length;a++){
            if (res[a]<=0){
                return "not pangram";
            }
        }
        return "pangram";

    }
