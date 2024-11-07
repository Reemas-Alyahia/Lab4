//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c1=new Circle(4.3);
        Rectangle r1=new Rectangle(3.8,6.6);
        Triangle t1=new Triangle(5.7,3.8);

        System.out.println("------------------------------------------");

        System.out.println("مساحة المثلث تساوي :  "+String.format("%.2f",t1.calculateArea()));
        System.out.println("محيط المثلث يساوي :   "+String.format("%.2f",t1.calculateCircumference()));
        System.out.println("------------------------------------------");

        System.out.println("مساحة المستطيل تساوي :  "+String.format("%.2f",r1.calculateArea()));
        System.out.println("محيط المستطيل يساوي :   "+String.format("%.2f",r1.calculateCircumference()));

        System.out.println("------------------------------------------");
        System.out.println("مساحة الدائرة تساوي :  "+String.format("%.2f",c1.calculateArea()));
        System.out.println("محيط الدائرة يساوي :   "+String.format("%.2f",c1.calculateCircumference()));

    }
}