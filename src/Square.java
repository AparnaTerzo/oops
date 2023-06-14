public class Square extends Shape {
    int side;
    public Square(String color,int side){
        super(color);
        this.side = side;
    }
    void area(){
        System.out.println("The area of Square is "+(side*side));
    }

    @Override
    void perimeter() {
        System.out.println("The perimeter of Square is "+(4*side));

    }
}
