package Array;

public class TimeComplexityDemo {
    public static void main(String[] args){
        double now = System.currentTimeMillis();

        TimeComplexityDemo demo = new TimeComplexityDemo();
        System.out.println(demo.findSum(99999));
        System.out.println("Time taken - "+(System.currentTimeMillis() - now)+"millisecond");
    }
    public int findSum(int n){  // time take 0 millisecond
        return n*(n+1)/2;
    }
//    public int findSum(int n){
//        int sum =0;
//        for(int i=0;i<=n;i++){  // Time take 1 millisecond
//            sum+=i;
//        }
//        return sum;
//    }
}
