class armstrong
    {
        public static void main()
            {
                int rem=0,total=0,j=0;
                for(int i=1; i<=100; i++)
                    {
                        j=i;
                        while(j>0)
                            {
                                rem=j%10;
                                total+=rem*rem*rem;
                                j= j/10;
                            }
                        if(i==total)
                            System.out.println(i);
                       System.out.println(i);     
                        }
                    }
                }