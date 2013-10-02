class TaxiFare
    {
        public static void main(double km)
            {
                double x;
                double a;
                if(km<=1)
                    {
                        a=25*km;
                    }
                else if(km<=6)
                    {
                        x=km-1;
                        a=25+(x*10);
                    }
                else if(km<=12)
                    {
                        x=km-6;
                        a=25+(5*10)+(x*15);
                    }
                else if(km<=18)
                    {
                        x=km-12;
                        a=25+(5*10)+(6*15)+(x*20);
                    }
                else
                    {
                        x=km-18;
                        a=25+(5*10)+(6*15)+(6*20)+(x*25);
                    }
		System.out.print("Fare="+a);
                }
            }
