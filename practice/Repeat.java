class HelloWorld {
    public static void main(String[] args) {
        String str = "easy";
        System.out.println(repeater(str, 3));
    }

    public static String repeater(String str, int n) {
        int strLength = str.length();
        char[] charArr = new char[strLength];
        for (int i = 0; i < strLength; i++) {
            charArr[i] = str.charAt(i);
        }
        char[] printArr = new char[strLength * n];
        for (int i = 0; i < strLength; i++) {
            for (int j = 0; j < n; j++) {
                printArr[i * n + j] = charArr[i];
            }
        }
        String resultStr = new String(printArr);
        return resultStr;
    }
}
