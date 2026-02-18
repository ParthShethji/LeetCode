class Solution {
public:
bool hasAlternatingBits(int n) {
    int prev = n & 1;   // get last bit
    n >>= 1;

    while (n > 0) {
        int curr = n & 1;   // current last bit
        
        if ((curr ^ prev) == 0) {
            return false;   // same adjacent bits
        }
        
        prev = curr;       // update previous
        n >>= 1;
    }
    
    return true;
}

};