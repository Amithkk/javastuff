public class prime {
        public static void main(int m, int n) {
                
                for(int i=m; i < n; i++){                       
                        boolean primeNo = true;    
                        for(int j=2; j < i ; j++){
                                if(i % j == 0)
                                        primeNo = false;
                                                                
                        }
                        if(primeNo)
                                System.out.print(i + " ");
                }
        }
}