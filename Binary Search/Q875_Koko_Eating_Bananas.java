/*
 * Problem Link : https://leetcode.com/problems/koko-eating-bananas/
 * Solution Link : https://leetcode.com/problems/koko-eating-bananas/solutions/3271188/java-o-n-log-m-solution/
 *
 * Time Complexity : O(n log m) where m -> is the size of search space (Max in (piles) - 1)
 * Space Complexity : O(1)
 */

class Q875_Koko_Eating_Bananas 
{
    public boolean isPossibleToEatBanana(int piles[], int speed, int hour)
    {
        int count = 0;

        for(int pile : piles)
        {
            count += pile / speed;
            if(pile % speed != 0)
                count++;
        }
        
        return count <= hour;
    }


    public int minEatingSpeed(int[] piles, int h) 
    {
        int left = 1;
        int right = piles[0];

        for(int pile : piles)
            right = Math.max(right, pile);

        while(left < right)
        {
            int mid = left + (right - left)/2;

            if(isPossibleToEatBanana(piles, mid, h))
                right = mid;
            else
                left = mid + 1;
        }
        
        return left;
    }
}
