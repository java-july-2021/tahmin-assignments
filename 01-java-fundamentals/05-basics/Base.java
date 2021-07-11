import java.util.ArrayList;
import java.util.Arrays;

public class Base {

    public static void main(String[] args) {

        int[] mynumber = new int[255];
        for (int i = 0; i < mynumber.length; i++) {
            mynumber[i] = i + 1;
        }
        System.out.println(Arrays.toString(mynumber));

        // print odd Numbers
        for (int i = 0; i < 255; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // sum
        int sum = 0;
        for (int i = 0; i < 255; i++) {
            sum += i;
            System.out.println("New number :" + i + " Sum is: " + sum);
        }
        // iterating
        ArrayList<Object> iterate = new ArrayList<Object>();
        iterate.add(1);
        iterate.add(3);
        iterate.add(5);
        iterate.add(6);
        iterate.add(-16);
        System.out.println(iterate);
        // Average
        int[] Average = { 3, 10, 6, 1 };
        int sumAverage = 0;
        int Ave = 0;
        for (int j = 0; j < Average.length; j++) {
            sumAverage = sumAverage + Average[j];
        }
        Ave = sumAverage / Average.length;
        System.out.println(Ave);
        // Array with odd numbers
        ArrayList<Object> arrodd = new ArrayList<Object>();
        for (int i = 1; i < 255; i += 2) {
            arrodd.add(i);
        }
        System.out.println(arrodd);
        // greater than Y
        int[] greater = { 1, 2, 10, 12 };
        int y = 4;
        for (int i = 0; i < greater.length; i++) {
            if (greater[i] > y) {
                System.out.println(greater[i]);
            }
        }
        // Square the value
        int[] Squar = { 2, 3, 10, -6 };
        ArrayList<Object> resu = new ArrayList<Object>();
        int Squarresult = 0;
        for (int i = 0; i < Squar.length; i++) {
            Squarresult = Squar[i] * Squar[i];
            resu.add(Squarresult);
        }
        System.out.println(resu);

        // Eliminate Negative Number
        int[] negative = { 9, -3, 2, -8, 12 };
        ArrayList<Object> Eliminate = new ArrayList<Object>();
        for (int x = 0; x < negative.length; x++) {
            if (negative[x] < 0) {
                negative[x] = 0;
                Eliminate.add(negative[x]);
            }
        }
        System.out.println(Arrays.toString(negative));
    }
}

    

