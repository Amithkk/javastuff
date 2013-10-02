class findoccurance 
    {
        public static void main(String s,String sb)
            {
                int y=sb.length(),ctr=0,x=s.length();
                String temp;
                for(int i=y;i<=x;i++)
                    {
                        temp= sb.substring(i-y,i);
                        System.out.println(temp);
                        if(temp.equals(sb))
                            ctr++;
                                     
                   }
                   System.out.println(ctr);
                }
            }
            
                        
                        