class add3
    {
        public static void main(int n)
        {
            double currentSum,currentProduct,totalSum=0;
            for(int i=2;i<=n+1;i++)//Loop that cycles through the sets of fractions
                {
                    currentSum=0;
                    currentProduct=1;
                    for(int x=1;x<=i;x++)//Loop that calculates through the numbers of the fraction
                        {
                        currentSum+=x;
                        currentProduct*=x;
                    }
                    totalSum+=currentSum/currentProduct;// current numerator
                    System.out.println(totalSum);//Debug Code
                    }
            System.out.println("Result="+totalSum);//final print
            }
        }
