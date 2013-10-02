class charcount
    {
        public static int charCheck(String s, char c)
            {
                int ctr=0;
                for(int i=0;i<s.length();i++)
                    {
                        if(s.charAt(i)==c)
                            ctr++;
                        }
                return(ctr);
            }
        public static void main(String s)
            {
                int xctr;
                for(char n='A';n<='Z';n++)
                    {
                        xctr=charCheck(s,n);
                        if(xctr>0)
                            System.out.println(n+"\t"+xctr);
                        }
                for(char n='a';n<='z';n++)
                    {
                        xctr=charCheck(s,n);
                        if(xctr>0)
                            System.out.println(n+"\t"+xctr);
                        }
                    }
        
        }