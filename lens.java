import java.util.*;
class lens
    {
        public static void main()
            {
                String s="This is   a test to remove 2 whitespaces";
                Scanner sc= new Scanner(s);
                String s1="";
                int ctr=0;
                while(sc.hasNext())
                    {
                        s1+=sc.next()+" ";
                        ctr++;
                    }
                System.out.print(s1.trim()+"\n No of words="+ctr);
            }
        }