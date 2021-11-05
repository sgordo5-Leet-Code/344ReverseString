public class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int up = s.length - 1;

        while(low < up) {
            char temp = s[low];
            s[low] = s[up];
            s[up] = temp;

            low++;
            up--;
        }
        System.out.println(s);
    }
}
