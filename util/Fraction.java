package util;

public class Fraction {
    private int num;
    private int den;
    public static final Fraction ZERO = new Fraction(0, 1);
    public static final Fraction UN = new Fraction(1, 1);

    public Fraction() { this.num = 0; this.den = 1;}
    public Fraction(int num, int den) { this.num = num; this.den = den;}

    public int getNum(){
        return num;
    }

    public int getDen(){
        return den;
    }


    public void setNum(int newNum){
        num = newNum;
    }

    public void setDen(int newDen) throws IllegalAccessException{
        if (newDen == 0) {
            throw new IllegalAccessException("Division par 0.");  
        }
        den = newDen;
    }

    public String toString(){
        return this.getNum() + "/" + this.getDen();
    }
}