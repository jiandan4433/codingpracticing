package dailypracticing;

public class dailycoding2 {
    public static void main(String []arg)
    {
        int case1[] = new int[] {1, 2, 3, 4, 5};
        //int case2[] = new int[] {3, 2, 1};
        int result[] = productofarray(case1);
        //int result2[] = product_of_all_num(case2);
        for (int i = 0; i < case1.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
    //using division
    public static int[] product_of_all_num(int product[])
    {
        int temp = 1;
        for (int i = 0; i < product.length;i++)
        {
            temp = temp * product[i];
        }
        for (int i = 0; i < product.length; i++)
        {
            product[i]=(temp/product[i]);
        }
        return product;
    }
    public static int[] productofarray(int[] nums)
    {
        int len = nums.length;
        if (len <= 1)
            return new int[] {};

        int[] left = new int [len];
        int[] right = new int[len];
        int[] result = new int[len];
        left[0] = 1;
        right[len-1] = 1;
        for (int i = 1; i < len; i++)
        {
            left[i] = nums[i-1] * left[i-1];
        }
        for (int i = len-2; i >= 0 ; i--)
        {
            right[i] = right[i+1]*nums[i+1];
        }
        for (int i = 0 ; i < len; i++)
        {
            result[i] = left[i]*right[i];
        }
        return result;
    }
    public static int[] product_of_all_num_bruteforce(int product[])
    {
        int len = product.length;
        int result[]= new int[len];
        for (int i = 0; i < len; i++)
        {
            int temp = 1;
            for (int j = 0 ; j < len ; j++)
            {
                if (i == j )
                    j++;
                if (j < len)
                    temp = temp * product[j];
            }
            result[i] = temp;
        }
        return result;
    }
}
