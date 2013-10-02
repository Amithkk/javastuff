class AutomorphicNumber 
    {
        public static void main(int n) 
            {
                int d=10;
                if (d >= n) 
                    {
                        if ((n * n) % d == n) 
                            {
                                System.out.println("Automorphic Number");
                            } 
                        else 
                            {
                                System.out.println("Not Automorphic Number");
                            }
                }
                else if (d <= n) 
                    {
                        d = d * 10;
                        if ((n * n) % d == n) 
                            {
                                System.out.println("Automorphic Number");
                            }
                        else 
                            {
                                System.out.println("Not automorphic number");
                            }
                }
        }
}