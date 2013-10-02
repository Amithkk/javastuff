class intpop
    {
        public static void main(int a[],int b)
            {
                int c[]=new int[a.length-1];
                for(int i=0,j=0;i<a.length;i++,j++)
                    {
                        if(i==b)
                            {
                                j--;
                                continue;
                            }
                        c[j]=a[i];
                    }
                for(int i=0;i<c.length;i++)
                    System.out.println(c[i]);
                
                }
            }