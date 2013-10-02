import java.io.*; 
import java.util.ArrayList;

class intsV2{
    public static void main(String args[]) throws IOException {
        int sum=0,curNo=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> y = new ArrayList<Integer>();
        System.out.println("Enter 10 integers, pressing enter after each integer");
        for(int i=1;i<=10;i++)
            {
                 System.out.println("Enter Integer "+i+":");                 
                 curNo=Integer.parseInt(br.readLine());
                 System.out.println(curNo);
                 if(curNo%2==0);
                    sum+=curNo;
            }
        br.close();
        //for (int i=0;i<10;i++) 
        //    {
        //       if(y.get(i)%2==0)
        //       sum+=y.get(i);
        //       }
        System.out.println("Sum="+sum);
        }
    }
