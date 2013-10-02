class swcasetest
    {
        public static void main(int num)
            {
                switch(num)
                    {
                        case 5:num++;
                               System.out.print(num);
                        case 6:System.out.print("SIX");
                        case 7:System.out.println(num);
                        case 0:System.out.println("zero");
                               break;
                        case -1:++num;num*=2;
                                System.out.print(num);
                        default:System.out.println("Case not Matching");
                    }
                }
            }