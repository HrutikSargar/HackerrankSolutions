char[] data=s.toCharArray();
        int count=1;
        for (int a=0;a<data.length;a++){
            if (data[a]>64 && data[a]<=90){
                count++;
            }
        }
        return count;
