package arrays;

public class ArraysMultiDim {
    public static void main(String[] args) {
        System.out.println("Zaczynamy tablice wielowymiarowe");
        //niewiele sie to rozni od macierzy
        int[][] tablica2wymiarowa = new int[2][3];
        tablica2wymiarowa[0][0]=0;
        tablica2wymiarowa[0][1]=1;
        tablica2wymiarowa[0][2]=2;
        tablica2wymiarowa[1][0]=1;
        tablica2wymiarowa[1][1]=2;
        tablica2wymiarowa[1][2]=3;
        System.out.println("pierwszy element macierzy 2x3 (chodzi o element 0x0) "+tablica2wymiarowa[0][0]);

        //jak przy 2D mozna inaczej deklarowac tablice
        double [][] tablicaDoubleDwuwymiarowa = {
                {1,2,3},
                {2,3,4},
                {30,40,50}
        };
        System.out.println("Element 0x0 macierzy :"+tablicaDoubleDwuwymiarowa[0][0]);
        System.out.println("Element 1x2 macierzy "+tablicaDoubleDwuwymiarowa[1][2]); //najpierw idzie po wierszach potem po kolumnach



    }
}
