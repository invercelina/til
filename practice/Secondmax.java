class HelloWorld {
    public static void main(String[] args) {
        int[] myArray = {-50,-49,-48,-47,-46};
        System.out.println(secondMax(myArray));
    }
    static int secondMax(int[] arr) {
        int carrier = arr[0];
        int record = 0;
        for(int i = 1; i<arr.length ; i++){
            if (arr[i] > carrier){
                carrier = arr[i];
                record = i;
            }
        }
        carrier = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length ; i++){
            if (i==record) {
                continue;
            }
            if (arr[i] > carrier) {
                carrier = arr[i];
            }
        }
        return carrier;
    }
}
