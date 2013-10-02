class AtoZ
    {
        public static void main()
            {
                for(char a='a';a<='z';a++)
                    {
                        System.out.print(Character.toUpperCase(a));
                        for(char b=(char)(a+1);b<='z';b++)
                            System.out.print(b);
                        System.out.println();
                    }
                }
            }   
                        