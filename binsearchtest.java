class binsearchtest
    {
        public static void main(int a[],int b)
            {
                boolean foundOnce=false;
                int min=0,max=a.length-1,mid=0;
                while(min<max)
                    {
                        mid=(min+max)/2;
                        if(b==a[mid])  
                            {
                                System.out.println("Element found at "+mid);
                                foundOnce=true;
                                break;
                            }
                        if(b<a[mid])
                            max=mid-1;
                        if(b>a[mid])
                            min=mid+1;
                        }
                if(!foundOnce)
                    System.out.println("Element not found");
                }
            }
            
                       
                