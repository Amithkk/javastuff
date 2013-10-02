class RailwayFare
    {
        public static void main(int a, double d)
            {
                int t=0;
                if(a<10)
                    {
                        if(d<10)
                            t=5;
                        else if(d<=50)
                            t=20;
                        else if(d>50)
                            t=50;
                        }
                else if(a<=60)
                    {
                        if(d<10)
                            t=10;
                        else if(d<=50)
                            t=40;
                        else if(d>50)
                            t=80;
                        }
                else if(a>60)
                    {
                        if(d<10)
                            t=4;
                        else if(d<=50)
                            t=15;
                        else if(d>50)
                            t=35;
                        }
                System.out.println("Fare="+t);
                    }
                }