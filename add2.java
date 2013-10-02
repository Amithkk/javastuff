class add2
    {
        public static void main(int x, int n)
            {
                double a=3,total=0;
                for(int i=1;i<=n;i++)
                {
                    total+=(1/a)*Math.pow(x,a);
                    a+=2;
                }
                total= x-total;
                System.out.println("Sum="+total);
            }
        }
                