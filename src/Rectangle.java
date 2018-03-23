public class Rectangle {

    double wid;
    double len;

    public void square()
    {
        System.out.println(wid*len);
    }

    public double perimetr()
    {
    return ((len+wid)*2);
    }

    public Rectangle(double wid, double len) {
        this.wid = wid;
        this.len = len;
    }
}
