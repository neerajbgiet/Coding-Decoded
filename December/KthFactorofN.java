/*Given two positive integers n and k.
A factor of an integer n is defined as an integer i where n % i == 0.
Consider a list of all factors of n sorted in ascending order, 
return the kth factor in this list or return -1 if n has less than k factors
*/

class KthFactorofN {
    public int kthFactor(int n, int k) {
        for(int i=1,j=0;i<=n;i++) // Iterate from start till n 
        {
            if(n%i==0){  //If it is factor, check if it is occurring kth time and return. 
                j++;
                if(j==k)
                    return i;
            }
        }
        return -1;
    }
}
