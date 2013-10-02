import java.util.*;
class platintrans
    {
        public static String translate(String s)//Does not add -way to words starting with a vowel since it is not specified in the question.
            {
                char c;
                int fv=0;
                for(int i=0;i<s.length();i++)
                    {
                        c=s.charAt(i);
                        if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                            {
                                fv=i;
                                break;
                            }
                        }
                String s1=s.substring(fv)+s.substring(0,fv)+"ay";
                return(s1);
            }
        public static void main(String orig)
            {
                orig=orig.toLowerCase();
                Scanner sc=new Scanner(orig);
                String latin="";
                while(sc.hasNext())
                    {
                        latin+=translate(sc.next())+" ";
                        System.out.println(latin);
                    }                
            }
                
}
                            