abstract class Bank {
    abstract void ATM();

    abstract void KYC();

    abstract void SB();
}

class SBI extends Bank {
    void ATM() {
        System.out.println("SBI ATM facility");
    }

    void KYC() {
        System.out.println("kyc : Adhar only ");
    }

    void SB() {
        System.out.println("Create SB Account");
    }
}

class Axis extends Bank {
    void ATM() {
        System.out.println("Axis ATM facility");
    }

    void KYC() {
        System.out.println("kyc : Pan only ");
    }

    void SB() {
        System.out.println("Create SB Account optional");
    }
}

public class AbstractDemo {

    public static void main(String[] args) {
        SBI s = new SBI();
        s.ATM();
        s.KYC();
        s.SB();
        Axis a = new Axis();
        a.ATM();
        a.KYC();
        a.SB();
    }

}
