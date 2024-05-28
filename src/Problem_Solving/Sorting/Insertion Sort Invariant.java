 public static void insertionSort(int[] A){
        for(int i = 0; i < A.length-1; i++){
          for(int a=i+1;a>0;a--){
              if(A[a]<A[a-1]){
                int temp=A[a];
                A[a]=A[a-1];
                A[a-1]=temp;
              }else{
                  break;
              }
          }
        }

        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
