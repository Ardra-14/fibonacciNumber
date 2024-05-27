
public class fibonacci {
    public int process(int n){
        if( n == 0 ){
            return 0;
        } else if (n == 1) {
            return 1;
        }else{
            return (process(n - 1) + process(n - 2));
        }
    }
}
