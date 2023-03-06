package arrays;

public class Arrays2D {
    public static void main(String[] args) {
        System.out.println("Zaczynamy tablice - numerowanie jak w Python od 0");
        //tablica[indeks]
        int[] tablica;
        tablica = new int[10]; //musimy zadeklarować wielkość tablicy
        tablica[0]=10;
        tablica[1]=20;
        tablica[2]=30;
        tablica[3]=40;
        //jak sie pobiera wartosci?
        System.out.println("6sty element tablicy wynosi "+tablica[5]);
        //tworzymy tablice obiektow typu double
        double [] tablicaDouble;
        tablicaDouble = new double[5];
        tablicaDouble[0]=0.1;
        tablicaDouble[1]=0.2;
        tablicaDouble[2]=0.3;
        tablicaDouble[3]=0.4;
        tablicaDouble[4]=0.5;
        System.out.println("pierwszy element tablicy z obiektami double to "+tablicaDouble[0]);
        //inny sposob przypisywania tablic
        int[] nowaTablica = new int[] {5,10,15,20,25,30};
        System.out.println("print nowaTablica"+nowaTablica);
        System.out.println("print nowaTablica[4] :"+nowaTablica[4]);
        //nie moge wczytac tabeli bez petli ale moge wczytac rozmiar tablicy
        System.out.println("Rozmiar tablicy nowaTablica :"+nowaTablica.length);
    }
}
