package pl.edu.uj.javaframe;

public class ImaginaryInt extends Int{

    Int imaginaryPart;
//    private Object Value;


    public Value create(String val) {
        String[] x = val.split("i");
        this.value = new Int().create(x[0]).value;

        if(x.length == 2) {
            imaginaryPart = (Int) new Int().create(x[1]);
        } else {
            imaginaryPart = (Int) new Int().create("0");
        }
        return this;
    }

    @Override
    public Value add(Value v) {
        if (v instanceof ImaginaryInt) {
            super.add((Value) v.value);
            imaginaryPart.add(((ImaginaryInt) v).imaginaryPart);
        } else if (v instanceof  Int) {
            super.add((Value) v.value);
        }
        return this;
    }

    public String toString() {
        return super.value + " + " + imaginaryPart + "i";
    }
}
