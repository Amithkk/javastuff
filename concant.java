class concant
    {
        public static void main(String s, String s1)
            {
                String s2=s;
                for(int i=0;i<s1.length();i++)
                    s2+=s1.charAt(i);
                System.out.println(s2);
            }
        }