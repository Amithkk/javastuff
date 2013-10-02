import java.util.*;
class noofwords
    {
        public static void main()
            {
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Sentence:");
                String scan=sc.nextLine();
                Scanner gg=new Scanner(scan);
                int ctr=0;
                while(gg.hasNext())
                    {
                        String tmp=gg.next();
                        ctr++;
                    }
                System.out.println("No of words="+ctr);
            }
        }