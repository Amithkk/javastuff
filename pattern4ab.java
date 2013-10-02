class pattern4a
    {
        public static void main()
            {
                for(int i=4;i>=1;i--)
                    {
                        for(int j=4;j>i;j--)
                            System.out.print(" ");
                        for(int k=1;k<=i;k++)
                            System.out.print(k);
                        for(int l=i-1;l>=1;l--)
                            System.out.print(l);
                        System.out.println();
                    }
                }
            }