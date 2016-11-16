public class Main {

    public static long f(long x){
        if(x>0) return x%10+f(x/10);
        else return 0;
    }
    public static void main(String[] args) {

        byte[] N = new byte[500];
        N[0] = 1;
        int M=0;

        for (int j=0; j<1000; j++){
            for(int i=498; i>=0; i--){
                N[i]*=2;
                if(N[i]>9) N[i+1]++;
                N[i]%=10;
            }
        }

        for(int i=499; i>=0; i--)
            //System.out.print(N[i]);
            M+=N[i];
        System.out.println(M);

    }
}
