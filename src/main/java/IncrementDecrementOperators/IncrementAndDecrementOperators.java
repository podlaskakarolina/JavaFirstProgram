package IncrementDecrementOperators;

public class IncrementAndDecrementOperators {
    public static void main(String[] args) {
        System.out.println("Another file");
        int number = 50;

        // Display the value in number.
        System.out.println("Number is " + number);

        // Increment number.
        number++;

        // Display the value in number.
        System.out.println("Now, number is " + number);

        // Decrement number.
        number--;

        // Display the value in number.
        System.out.println("Now, number is " + number);

        //The example of the increment operator is:
        //Pre-increment:
        ++number;
        System.out.println("Pre-increment: ++number");
        System.out.println(number);
        //Post-increment:
        number++;
        System.out.println("Post-increment: number++");
        System.out.println(number);

        //The example of the decrement operator is:
        //Pre-increment:
        --number;
        System.out.println("Pre-increment: --number");
        System.out.println(number);
        //Post-increment:
        number--;
        System.out.println("Post-increment: number--");
        System.out.println(number);
        /*
        Both the pre- and post-increment operators increment the value of the variable by 1.
        Similarly, the pre- and post-decrement operators decrement the value of the variable by 1.
        The difference becomes apparent when the variable using these operators is employed in an expression.
        x = 5;
        y = 10 + (++y);
         */
        int x=5, y=10;
        int z = x * ++y;
        System.out.println("z = z * ++y is "+ z);//55
        int zz = x * y++;
        System.out.println("zz = x * y++ is " + zz); //tez 55
        //TODO znalezc java ludka by wyjasnil roznice bo ni chuja nie widze w kodzie a czuje ze bedzie na egzaminie
        //jeszcze jedna proba
        int d = 100;
        int b = d++;
        int c = ++d;
        //int e = ++(++d);
        System.out.println("value of d is "+ d);//102
        System.out.println("value of b is "+ b);//100 nie ma lipy bym to zrozumiale wytlumaczyla komus :D
        System.out.println("value of c is "+ c);//102
        //System.out.println("value of e is "+ e);//102 not valid code 0 why?


    }
}
