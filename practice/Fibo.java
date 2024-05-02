class HelloWorld {
    public static void main(String[] args) {
        System.out.println(reArrFibo(11));
    }

    static int reArrFibo(int n) {
        int[] fibo = new int[n + 2];
        fibo[1] = 1;
        fibo[2] = 1;
        for (int i = 3; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n - 1];
    }
}
