public static int runningTime(List<Integer> arr) {
    // Write your code here
    int count=0;
    for(int a=0;a<arr.size()-1;a++){
        for(int b=a+1;b>0;b--){
            if(arr.get(b) < arr.get(b-1)){
                count++;
                int temp = arr.get(b);
                arr.set(b,arr.get(b-1));
                arr.set(b-1, temp);
            }else{
                break;
            }
        }
    }
        return count;
    }
