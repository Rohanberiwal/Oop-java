import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Main {
    public static class ArraySum implements Runnable {
        private int array[];
        private int low;
        private int high;
        private int size;
        private int sum;

        public ArraySum(int array[], int size, int low, int high) {
            this.array = array;
            this.size = size;
            this.low = low;
            this.high = high;
        }

        @Override
        public void run() {
            compute();
        }

        public void compute() {
            for (int i = low; i < high; i++) {
                sum = sum + array[i];
            }
        }

        public int getSum() {
            return sum;
        }
    }

    public static void main(String args[]) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int size = 6;
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        ArraySum left = new ArraySum(array, size, 0, 3);
        ArraySum right = new ArraySum(array, size, 3, 6);
        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.execute(left);
        exec.execute(right);
        exec.shutdown();
        exec.awaitTermination(Long.MAX_VALUE, java.util.concurrent.TimeUnit.NANOSECONDS);
        int result = left.getSum() + right.getSum();
        System.out.println(" " + result);
    }
}
