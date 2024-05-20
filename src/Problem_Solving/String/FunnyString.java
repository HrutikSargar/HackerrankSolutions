public static String funnyString(String s) {
    // Write your code here
     String temp="";
        for (int a=0;a<s.length();a++){
            temp=s.charAt(a)+temp;
        }
        int [] aCount=new int[s.length()];
        int [] tempCount=new int[s.length()];

        for (int a=0;a<s.length();a++){
            aCount[a]=s.charAt(a);
            tempCount[a]=temp.charAt(a);
        }
        ArrayList<Integer>aC=new ArrayList<>();
        ArrayList<Integer>tempC=new ArrayList<>();

        for (int a=0;a<aCount.length-1;a++){
           int res= aCount[a]-aCount[a+1];
           int res2=tempCount[a]-tempCount[a+1];
           aC.add(Math.abs(res));
           tempC.add(Math.abs(res2));
        }
       for (int a=0;a<aC.size();a++){
           if (!Objects.equals(aC.get(a), tempC.get(a))){
               return "Not Funny";
           }
       }
       return "Funny";

    }
