class selsorttest
    {
        public static void main(int a[])
            {
                for(int i=0;i<a.length-1;i++)
                    {
                        int s=a[i],p=i;
                        for(int j=i+1;j<a.length;j++)
                            {
                                if(a[j]<a[i])
                                    {
                                        s=a[j];
                                        p=j;
                                    }
                                a[p]=a[i];
                                a[i]=s;
                            }
                        }
                for(int i=0;i<a.length;i++)
                    System.out.println(a[i]);
                    }
                }
                    