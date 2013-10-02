class breaktest
    {
        public static void main()
            {
                for(int i=0;i<=10;i++)
                    {
                        System.out.println("OIteration "+i);
                            for(int j=0; j<=10;j++)
                                {
                                    if(j%2==0)
                                        continue;
                                    System.out.println("IIteration "+j);
                                    
                                }
                            }
                        }
                    }
                                     