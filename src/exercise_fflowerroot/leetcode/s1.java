package exercise_fflowerroot.leetcode;

import java.util.HashSet;
import java.util.Set;

public class s1 {
	public static void main(String[] args) {
		
	}
	
//  "aA"
//	"aAAbbbb"
	// add / remove / contains
	
    public int numJewelsInStones(String jewels, String stones) {
        //t t 나오면 1
        Set<Character> s = new HashSet<>();
        int cnt=0;
        for(int i =0; jewels.length()>i; i++){
            s.add(jewels.charAt(i));
        }
        
        for(int i =0; stones.length()>i; i++){
            if(!s.remove(stones.charAt(i))){
                cnt++;
            }
        }
        return cnt;
        
    }
}
