class HelloWorld {
    public static void main(String[] args) {
        String str = "easy";
        repeater(str, 3);
    }

    public static void repeater(String str, int n) {
        int strLength = str.length();
        char[] charArr = new char[strLength];
        for (int i = 0; i < strLength; i++) {
            charArr[i] = str.charAt(i);
        }
        for (int i = 0; i < strLength; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(charArr[i]);
            }
        }
    }
}
