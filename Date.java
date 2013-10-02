class Date
    {
        int dd;
        int mm;
        int yy;
        public Date()
            {
                dd=1;
                mm=1;
                yy=2013;
            }
        public void setDate(int d,int m,int y)
            {
                dd=d;
                mm=m;
                yy=y;
            }
        public boolean isLeap()
            {
                if((yy % 4 == 0) || (yy % 400 == 0))
                    return(true);
                return(false);
            }
        public boolean isValid()
            {
                if(((dd>0)&&(dd<=31))&&((mm>0)&&(mm<=12))&&(String.valueOf(yy).length()==4))
                    return(true);
                return(false);
            }
        }