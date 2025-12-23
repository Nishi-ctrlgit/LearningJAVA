class CallByValAndCallByRef {

    int p;   // instance variable (object ke andar rahega)
    int q;   // instance variable

    public static void main(String[] args) {

        // object banaya
        CallByValAndCallByRef obj = new CallByValAndCallByRef();

        int x = 10;
        int y = 20;

        // yahan PRIMITIVE values ja rahi hain
        obj.testSum(x, y);
        // x aur y ki COPY method ko mili
        // x aur y main() ke andar change nahi honge

        // object ke andar values set kar rahe hain
        obj.p = 50;
        obj.q = 60;

        // yahan OBJECT ka reference pass ho raha hai (COPY of reference)
        obj.swap(obj);

        // swap ke baad print
        System.out.println(obj.p); // 60
        System.out.println(obj.q); // 50
    }

    // =============================
    // PASS BY VALUE (primitive)
    // =============================
    public int testSum(int a, int b) {

        // a aur b x,y ki COPY hain
        a = 30;
        b = 40;

        int c = a + b;
        return c;

        // NOTE:
        // x aur y main() me SAME hi rahenge (10,20)
    }

    // =============================
    // SO-CALLED "CALL BY REF"
    // =============================
    public void swap(CallByValAndCallByRef t) {

        // t ko obj ka COPY OF REFERENCE mila hai
        // t aur obj SAME object ko point kar rahe hain

        int temp;

        temp = t.p;   // temp = 50
        t.p = t.q;    // p = 60
        t.q = temp;   // q = 50

        // object ke ANDAR ka data change hua
        // reference nahi, DATA change hua
    }
}
