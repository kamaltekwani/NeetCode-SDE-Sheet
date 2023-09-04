/*
 * Problem Link : https://leetcode.com/problems/car-fleet/
 * Solution Link : https://leetcode.com/problems/car-fleet/solutions/139850/c-java-python-straight-forward/
 * 
 * Time Complexity : (N log N)
 * Space Complexity : O(N)
 */

class Q853_Car_Fleet 
{
    public int carFleet(int target, int[] position, int[] speed) 
    {
        double cars[][] = new double[position.length][2];

        for(int index=0 ; index<position.length ; index++)
        {
            cars[index][0] = position[index];
            cars[index][1] = (target - position[index]) / speed[index];
        }

        Arrays.sort(cars, (a, b)->Double.compare(a[0], b[0]));

        int result = 0;
        double current = 0;

        for(int index=position.length-1 ; index>=0 ; index--)
            if(current < cars[index][1])
            {
                current = cars[index][1];
                result++;
            }
        
        return result;
    }
}
