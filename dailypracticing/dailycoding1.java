package dailypracticing;

import java.util.Arrays;

public class dailycoding1 {
    public static void main(String []args){
        int case1[] = new int[] {10,15,3,7};
        int case2[] = new int[] {1,2,3,4,5,6,7,8,9,10};
        int k1 = 27;
        int k2 = 17;
        System.out.println(two_sum_equal_to_k(case1, k1));
        System.out.println(two_sum_equal_to_k(case2, k2));
    }
    public static boolean  two_sum_equal_to_k_force(int n[], int k)
    {
        int array_size = n.length;
        Arrays.sort(n);
        for (int i = 0 ; i < array_size; i++)
        {
            for (int j = 0 ; j < array_size; j++)
            {
                if ((n[i]+n[j]) == k)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean two_sum_equal_to_k(int n[], int k)
    {
        int array_size = n.length-1;
        Arrays.sort(n);
        int sum;
        if ((n[array_size]+n[array_size-1]) < k)
        {
            return false;
        }
        if ((n[0]) > k)
        {
            return false;
        }
        for (int i = 0, j = array_size; i < j;)
        {
            sum = n[i]+n[j];
            if ( sum == k)
                return true;
            else if (sum < k)
                i++;
            else
                j--;
        }
        return false;
    }

}
