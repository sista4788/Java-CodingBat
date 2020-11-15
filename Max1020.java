// Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

// max1020(11, 19) → 19
// max1020(19, 11) → 19
// max1020(11, 9) → 11

public class Max1020 {
    public int max1020(int a, int b) {
        Boolean aInRange = (a >= 10 && a <= 20);
        
        Boolean bInRange = (b >= 10 && b <= 20);
        
        int max = 0;
        
        if (aInRange && bInRange) {
        
            if(a >= b)
                max = a;
            else {
                max = b;
            }
        } else if (!bInRange && aInRange) {
            max = a;
        }
        else if (bInRange && !aInRange) {
            max = b;
        }
        return max;
        }
}
