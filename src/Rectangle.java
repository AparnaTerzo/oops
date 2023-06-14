public class Rectangle extends  Shape{
    int length;
    int breadth;
    public Rectangle(String color,int length, int breadth){
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void perimeter() {
        System.out.println("The perimeter of rectangle is "+2*(length+breadth));
    }

    @Override
    void area() {
        System.out.println("The area of rectangle is " +(length*breadth));
    }
}
