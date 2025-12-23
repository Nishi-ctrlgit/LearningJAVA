class CallByValue7 {
    int value;

    static void change(CallByValue7 b) {
        // b ko obj ka COPY OF REFERENCE mila

        b = new CallByValue7();
        // b ab naye object ko point kar raha hai
        // obj abhi bhi purane object ko hi point karta hai

        b.value = 100;
        // naye object ka data change
    }

    public static void main(String[] args) {

        CallByValue7 obj = new CallByValue7();
        obj.value = 10;

        change(obj);

        System.out.println(obj.value);
        // obj ka object kabhi replace hi nahi hua
    }
}
