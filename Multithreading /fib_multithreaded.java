// Parallel Implementation of Fibonacci
public class Fibonacci implements Runnable {
int result, n;
public Fibonacci(int n) { this.n = n; }
public static int fib(int n) {
if(n<2) return n;
else return fib(n-1) + fib(n-2);
}
public void run() {
result = fib(n);
}
public int getResult() { return result; }
public static void main(String[] args)
throws InterruptedException {
int n = 40;
Fibonacci left = new Fibonacci(n-1);
Fibonacci right = new Fibonacci(n-2);
Thread t1 = new Thread(left);
Thread t2 = new Thread(right);
t1.start(); t2.start();
t1.join(); t2.join();
int result = left.getResult() + right.getResult();
System.out.println(" "+result) ;
}
}
