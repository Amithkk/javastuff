class add6
    {
        public static void main(int a, int n)
            {
                double x=1,sum=0;
                for(int i=1;i<=n;i++)
                {
                    sum+=x/Math.pow(a,x+1);
                    x+=3;
                }
                System.out.println("Sum="+sum);
            }
        }