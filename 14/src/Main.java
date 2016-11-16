public class Main {
    public static long[] N = new long[1000001];

    public static long f(long x){
        //System.out.print(x+"->");
        if(x<=1000000 && N[(int)x]!=0)
            return N[(int)x];

        if(x==1) {
            N[(int)x] = 1;
            return 1;
        }
        if(x<=1000000){
            if(x%2==0)
                N[(int)x] = f(x / 2) + 1;
            else
                N[(int)x] = f(3*x+1) + 1;
            return N[(int)x];
        }
        else{
            if(x%2==0)
                return f(x / 2) + 1;
            else
                return f(3*x+1) + 1;
        }


    }

    public static void main(String[] args) {
        long m = 1, n=1;

        for (int i=1; i<1000000; i++ ){
            if(f(i)>m){
                m = f(i);
                n = i;
            }
        }
        System.out.println(n);

    }
}
