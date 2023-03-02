package ImplicitAndExplicitTypeCasting;

public class ImplicitTypeCasting {
    public static void main(String[] args) {
        System.out.println("uzupelnie notatki pozniej - okazuje sie ze to umiem i rozumiem");
        /*to w skrócie rozszerzanie typu zmiennych
        byte->short->int->long->float->double
        char->int

         */
        int a = 18;
        float b = a;
        System.out.println("wyprintuj a w int "+a);
        System.out.println("Po implicitTypeCasting into float b = "+b);

        char c = '7'; //zapisany bez '' wyswietlil ? :))))
        int d = c;
        float e = c;
        System.out.println("Ponownie próbujemy implicit Type Casting, mamy char " + c + " chcemy go zmienic w int \n"+ d +" a teraz zaszalejemy i we float " + e);
    }
}
