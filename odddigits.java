class odddigits
    {
        public static void main(int n)
         {
             int num=n,sum=0;
             while (num > 0) {
                 if((num%10)%2!=0)
                    sum+=num%10;
                 num = num/10;
                }
             System.out.println("Sum="+sum);
            }
        }