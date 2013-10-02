class pattern4b
    {
        public static void main()
            {
                for(int i=4;i>=1;i--)
                    {
                        for(int j=4;j>i;j--)
                            System.out.print(" ");
                        for(int k=i;k>=1;k--)
                            System.out.print(k);
                        for(int l=2;l<=i;l++)
                            System.out.print(l);
                        System.out.println();
                    }
                }
            }