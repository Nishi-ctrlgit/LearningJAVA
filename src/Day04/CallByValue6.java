public class CallByValue6 {

    int value;
    // Box ke andar ek integer value

    static void change(CallByValue6 b) {
        // b ko obj ka COPY OF REFERENCE mila
        // b aur obj SAME object ko point kar rahe hain

        b.value = 20;
        // SAME object ka data change ho raha hai
    }

    public static void main(String[] args) {

        CallByValue6 obj = new CallByValue6();
        // ek Box object bana

        obj.value = 10;
        // object ke andar value = 10

        change(obj);
        // obj ka reference COPY hoke b ko gaya

        System.out.println(obj.value);
        // SAME object tha
        // isliye value change ho chuki hai
    }
}
