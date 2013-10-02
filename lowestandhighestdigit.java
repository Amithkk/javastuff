class lowestandhighestdigit
    {
        public static void main(int n)
            {
                int num=n,smallest=num%10,largest=smallest;
                num/=10;
                while(num>0)
                    {
                        if(num%10<smallest)
                            smallest=num%10;
                        if(num%10>largest)
                            largest=num%10;
                        num/=10;
                    }
                System.out.println("Smallest number="+smallest+" Largest number="+largest);
            }
        }
                