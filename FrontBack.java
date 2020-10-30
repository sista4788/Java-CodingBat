
// Given a string, return a new string where the first and last chars have been exchanged.

// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"

public class FrontBack {
    public String frontBack(String str) {
        if(str.length() >1){
        String front = str.substring(0,1);
        String mid = str.substring(1, str.length()-1);
          return str.charAt(str.length()-1) + mid + front;
        }
        return str;
      }
      
}
