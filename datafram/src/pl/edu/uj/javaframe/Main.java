package pl.edu.uj.javaframe;

import java.io.IOException;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        DataFrame df = new DataFrame(new Class[] {Int.class, Int.class}, new String[] {"kol1",
                "kol2"});

        df.addRow(new String[]{"12","23"});
        df.addRow(new String[]{"1244","23"});
        df.addRow(new String[]{"1244","2553"});
        df.addRow(new String[]{"12","2300"});

        ImaginaryInt im1 = (ImaginaryInt) new ImaginaryInt().create("12");
        System.out.println(im1);
        ImaginaryDouble im2 = (ImaginaryDouble) new ImaginaryDouble().create("11i9");
        System.out.println(im2);

        System.out.println(new ImaginaryInt());



        new ImaginaryInt().create("12i4").add(new Int().create("10"));
                    new Int().create("10").add(new ImaginaryInt().create("12i4"));
//                    ImaginaryInt.create("12i4").add(ImaginaryInt.create("10i10"));
//        Int i = new Int("12");

//      INSTRUKCJE DO ĆWICZEŃ I

//      Dopisz metodę print w klasie DataFrame wypisującą zawartość dataframe
      df.print();

//      Dodaj klasę ImaginaryDouble oraz ImaginaryInt, które dziedziczą po odpowiednio klasach Int i Double . Powinne one być tworzone ze Stringów postaci "<CzęśćRzeczywissta>i<CzęśćUrojona>", np "12i3".

//      Nadpisz metody create i add w klasach ImaginaryDoubgle oraz ImaginaryInt. Pamiętaj, że do liczb urojonych możemy też dodawać inne typy (np. Int, Double).
//      Przetestuj wyniki operacji:
//                    ImaginaryInt.create("12i4").add(Int.create("10"));
//                    Int.create("10").add(ImaginaryInt.create("12i4"));
//                    ImaginaryInt.create("12i4").add(ImaginaryInt.create("10i10"));

//      Nadpisz metodę public String toString() w kasach ImaginaryDouble i ImaginaryInt, tak aby poprawnie wyświetlała liczby urojone do postaci Stringa



    }
}
