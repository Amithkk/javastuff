class stringlongest
    {
        public static void main(String s)
            {
                s=s.trim()+" ";
                int w=0;
                String l="";
                int lv=0;
                String s1=s.replace('a','a'+1);
                for(int i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)==' ')
                            {
                                l=s.substring(w,i);
                                lv=l.length();
                                w=i+1;
                            }
                        }
                System.out.println("Longest String is "+l+"\n and it's length="+lv);
                    }
                }
               