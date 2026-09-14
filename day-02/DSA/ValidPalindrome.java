public class ValidPalindrome {
    /*
    This solution use the approach to remove not valid characters first which creates a new string.
    Then again converts each character to lower which also create a new string
    Then creating a stringbuilder and assigning the same value to string 
    Then we use to compare where we compare the reverse of the string with the same string.
    Here we compare each character twice with each other.
    It overall time complexity of this solution is O(N) and Auxiliary space used is O(N) too.
     */
    public boolean isPalindromeBruteForce(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","");
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        if(sb.reverse().toString().equals(s))
            return true;
        return false;
    }

    /*
    In this solution I tried to use loop will be go to n/2 times at max.
    Here I used conditional blocks. first I tried to skip not valid condition 
    Then strictly check for valid once and move pointers
    If still anything left its mean the condition will be comparison between char versus num so return false;
     */
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else if(Character.isDigit(s.charAt(l)) && Character.isDigit(s.charAt(r))) {
                int c = s.charAt(l) - '0';
                int d = s.charAt(r) - '0';
                if(c == d){
                    l++;
                    r--;
                }else
                    return false;
            } else if (Character.isLetter(s.charAt(l)) && Character.isLetter(s.charAt(r))){
                if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                    l++;
                    r--;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }


    public boolean isPalindromeFinalSolution(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            if(!Character.isLetterOrDigit(s.charAt(l)))
                l++;
            else if(!Character.isLetterOrDigit(s.charAt(r)))
                r--;
            else if (Character.isLetterOrDigit(s.charAt(l)) && Character.isLetterOrDigit(s.charAt(r))){
                if (Character.toLowerCase(s.charAt(l)) == Character.toLowerCase(s.charAt(r))) {
                    l++;
                    r--;
                } else {
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }

}
