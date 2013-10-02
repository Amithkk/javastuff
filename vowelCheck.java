import java.util.*;
class vowelCheck 
    {
        public static boolean hasVowel(String s)
            {
                s=s.toLowerCase();
                char c;
                for(int i=0;i<s.length();i++)
                    {
                        c=s.charAt(i);
                        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                            return(true);
                        }
                return(false);
            }
        public static void main(String orig)
            {
                Scanner sc=new Scanner(orig);
                String curword="";
                while(sc.hasNext())
                    {
                        curword=sc.next();
                        if(!hasVowel(curword))
                            System.out.println(curword);
                        }
                    }
                }
                