
class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }
}

public class MethodOverrirde2 {
    public static void main(String[] args) {
        Bank b;

        b = new SBI();
        System.out.println(b.getInterestRate());

        b = new HDFC();
        System.out.println(b.getInterestRate());
    }
}
/*What’s happening internally?
Reference type → Bank
Object type → SBI / HDFC
JVM decides at runtime which method to call

➡️ Runtime polymorphism*/