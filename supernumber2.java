class supernumber
    {
        public static void main(int n)
            {
                int total=0,rem=0,cdigit=0,origno=n,fact;
                while(n>0)
                    {
                        fact=1;
                        cdigit=n%10;
                        n= n/10;
                        for(int c=1;c<=cdigit;c++)
                            fact*=c;
                        total+=fact;
                    }
                if(total==origno)
                    System.out.println("Number is a supernumber");
                else
                    System.out.println("Number is not a supernumber");
                }
            }
