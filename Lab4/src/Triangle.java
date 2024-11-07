public class Triangle extends Shape{
    private double height;  private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }
    public double getBase() {
        return base;
    }
    @Override
    public double calculateArea() {
        return (base*height)/2;
    }

    @Override
    public double calculateCircumference() {
        return base*3;
        // the math said it's a+b+c let see that all length are the same
        // at this case i can take one base and it will be enagh like * Square class*
    }
}
