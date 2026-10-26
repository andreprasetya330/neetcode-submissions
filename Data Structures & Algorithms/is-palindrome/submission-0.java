class Solution {
    public boolean isPalindrome(String s) {
        int L = 0;
        int R = s.length()-1;
        while(L<R){
            while(L<R && !Character.isLetterOrDigit(s.charAt(R))){
                R--;
            }
                
            while(R>L && !Character.isLetterOrDigit(s.charAt(L))){
                L++;
            }
            char right = s.charAt(R);
            char left = s.charAt(L);

            if(Character.toLowerCase(right) != Character.toLowerCase(left)){
                    return false;
                
            }
            L++;
            R--;
        }
        return true;
    }
}
