package Matrix;

public class Hello {
    static int maxnumber(int n, int k)
    {
        // Generate the largest number
        // after removal of the least
        // K digits one by one
        for (int j = 0; j < k; j++) {

            int ans = 0;
            int i = 1;

            // Remove the least digit
            // after every iteration
            while (n / i > 0) {

                // Store the numbers formed after
                // removing every digit once
                int temp = (n / (i * 10))
                        * i
                        + (n % i);
                i *= 10;

                // Compare and store the maximum
                ans = Math.max(ans, temp);
            }
            n = ans;
        }

        // Return the remaining number
        // after K removals
        return n;
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 6485315;
        int k = 3;

        System.out.println(maxnumber(n, k));
    }
}
