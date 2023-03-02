package ImplicitAndExplicitTypeCasting;

public class ExplicitTypeCasting {
    public static void main(String[] args) {
        /*
        ExplicitTypeCasting
         */
        int x = 400;
        byte a = (byte) x;
        System.out.println("mamy int x " + x +" zmieniamy na byte a " + a);
        //TODO czemu -122?
        byte minByte=-128;
        byte maxByte=127;
        int range = maxByte - minByte;
        int kombinuj = x - range;
        System.out.println(kombinuj);//przeliczylo na ASCII?


    }
}
