import java.util.*;
class alphaorder
    {
        public static void main(String s)
            {
                s=s.toLowerCase();
                Scanner sc=new Scanner(s);
                String temp,s2="",rm="";
                int j=0;
                char sm='0';
                while(sc.hasNext())
                    {
                        temp=sc.next();
                        while(temp.length()>0)
                            {
                               sm=temp.charAt(0);
                                for(int i=1;i<temp.length();i++)                                                              
                                  {
                                      char t=temp.charAt(i);
                                      if(t<sm)                                            
                                        sm=t;
                                             }                                                     
                                    
                                s2+=sm;
                                rm=temp;
                                temp="";
                                for(int i=0;i<rm.length();i++)
                                {
                                    if(rm.charAt(i)==sm)
                                        continue;
                                    temp+=rm.charAt(i);
                               }
                            }
                               s2+=" ";
                    }
                System.out.println(s2);
            }
        }
                        