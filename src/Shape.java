 abstract class Shape {
//    int length;
//    int breadth;
    String color;
    public Shape(String color){
        this.color = color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    abstract void area();
    abstract void perimeter();

}
