
// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.

// diff21(19) → 2
// diff21(10) → 11
// diff21(21) → 0

public class Diff21 {
    public int diff21(int n) {
        int difference = n - 21;
        if (n> 21 ) {
          return difference *2;
        }
        else if (n<=21){
          return 21 - n;
        }
        else {
          return difference;
        }
      }
      
}
