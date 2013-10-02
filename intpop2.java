class intpop2
    {
        public static void main(int a[],int b)
            {
                int c[]=new int[a.length-1];
                int p=-1;
                for(int i=0;i<a.length;i++)
                    if(a[i]==b)
                        {
                            p=i;break;
                        }
                if(p<0)
                    System.out.println("Number not found");
                else
                    {                        
                        for(int i=0,j=0;i<a.length;i++,j++)
                            {
                                if(i==p)
                                    {
                                        j--;
                                        continue;
                                    }
                                c[j]=a[i];
                            }
                        }
                for(int i=0;i<c.length;i++)
                    System.out.println(c[i]);
                }
            }
            
                                          