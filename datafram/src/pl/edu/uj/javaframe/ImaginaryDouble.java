package pl.edu.uj.javaframe;

public class ImaginaryDouble extends MyDouble{

    MyDouble imaginaryPart;

    public Value create(String val) {
        String[] x = val.split("i");
        this.value = super.create(x[0]).value;

        if(x.length == 2) {
            imaginaryPart = (MyDouble) new MyDouble().create(x[1]);
        } else {
            imaginaryPart = (MyDouble) new MyDouble().create("0");
        }
        return this;
    }

    public Value add(Value v) {
        if (v instanceof ImaginaryDouble) {
            super.add((Value) v.value);
            imaginaryPart.add(((ImaginaryDouble) v).imaginaryPart);
        } else if (v instanceof  Int) {
            super.add((Value) v.value);
        }
        return this;
    }

    public String toString() {
        return super.value + " + " + imaginaryPart + "i";
    }
}
