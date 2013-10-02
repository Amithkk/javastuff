class NeonNumber
    {
        public static void main(int n)
            {
                int sqn = n*n; 
                int sum=0,remainder;
                while(sqn > 0)
                    {
                        remainder = sqn % 10;
			            sum+=remainder;
			            sqn = sqn / 10;
			         }
			    if(sum == n)
			     System.out.println(n+" is a Neon Number");
			    else
			     System.out.println(n+" is not a Neon Number");
			 }
}