class pattern10
    {
        public static void main()
            {
                char a='A';
                for(int i=1;i<=5;i++)
                    {
                        for(int j=1;j<=i;j++)
                            System.out.print(i);
                        for(int k=5;k>=i;k--)
                            System.out.print(a);
                        a++;
                        System.out.println();
                        }
                    }
                }