public class flot_Mult {
    int a;
    int b;

    public void complex(int a, int b) {
        this.a = a;
        this.b = b;


    }

    void show() {
        System.out.println(a + " +i" + b);
    }

    public static void main(String[] args) {
        flot_Mult avi = new flot_Mult();
        avi.complex(12,15);
        avi.show();
        flot_Mult ravi=new flot_Mult();
        ravi.complex(25,50);
        ravi.show();
    }
}
