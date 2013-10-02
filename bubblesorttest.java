class bubblesorttest
    {
        public static void main()
            {
                int a[]={22,4,1,55,1,22,44,55,56,22};
                for(int i=0;i<a.length-1;i++)
                    {
                        for(int j=0;j<a.length-1;j++)
                            {
                                if(a[j]>a[j+1])
                                    {
                                        int temp=a[j];
                                        a[j]=a[j+1];
                                        a[j+1]=temp;
                                    }
                                }
                            }
                for(int i=0;i<a.length;i++)
                    System.out.println(a[i]);
                }
            }
                        