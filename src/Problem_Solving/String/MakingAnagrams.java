 public static int makingAnagrams(String s1, String s2) {
    // Write your code here
    int [] arr1=new int[26];
        int [] arr2=new int[26];

        for(int a=0;a<s1.length();a++){
            ++arr1[s1.charAt(a)-97];
        }
        for(int a=0;a<s2.length();a++){
            int b=s2.charAt(a)-97;
            ++arr2[b];
        }
        int count=0;
        for (int a=0;a<26;a++){
            if (arr1[a]!=arr2[a]){
                if (arr1[a]>arr2[a]){
                    int res=arr1[a]-arr2[a];
                    count+=res;
                }else {
                    int res=arr2[a]-arr1[a];
                    count+=res;
                }
            }
        }
        return count;

    }
