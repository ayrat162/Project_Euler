public class Main {

    public static int f(int N, int x, int y){
        int right = 0, down = 0;
        // System.out.println(x+" "+y);
        if(x < N) down = f(N,x+1,y);
        if(y < N) right = f(N,x,y+1);
        if(x==N && y==N) return 1;
        return right + down;
    }

    public static void main(String[] args) {
        for(int i=0;i<12;i++){
            System.out.println(f(i,0,0));
        }


    }
}
