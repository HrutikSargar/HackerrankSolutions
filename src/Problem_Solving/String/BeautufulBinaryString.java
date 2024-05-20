 public static int beautifulBinaryString(String s) {
    // Write your code here
    int count=0;
        for (int a = 0; a < s.length()-2; a++) {
            if (s.charAt(a) == '0') {
                int temp = 1;
                for (int b = a + 1; b < s.length(); b++) {
                    if (s.charAt(b) == '1' && s.charAt(b + 1) == '0') {
                        count++;
                        temp += 2;
                    } else {
                        break;
                    }
                }
                a = a + temp - 1;
            }
        }
        return count;

    }
