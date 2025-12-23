class CallByValue8 {
    int value;

    static CallByValue8 change(CallByValue8 b) {
        // b = obj ka COPY OF REFERENCE

        CallByValue8 temp = new CallByValue8();
        // naya object banaya

        temp.value = 99;
        // naye object ka data set

        return temp;
        // naya object return kiya
    }

    public static void main(String[] args) {

        CallByValue8 obj = new CallByValue8();
        obj.value = 10;

        obj = change(obj);
        // return hua object obj ko assign kiya
        // ab obj naya object point karta hai

        System.out.println(obj.value);
    }
}
