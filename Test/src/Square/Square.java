package Square;

public class Square extends Shape implements Color {
    double height;
    double width;
    String color;

    public Square(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public void setHeigh(double newHeigh, double newWidth) {
        super.setHeigh(newHeigh, newWidth);
    }

    @Override
    public void getHeigh(double newHeigh, double newWidth) {
        super.getHeigh(newHeigh, newWidth);
    }

    @Override
    public String howToColor(String color) {
        return color;
    }

    @Override
    double getAre() {
        return this.width * this.height;
    }

    @Override
    public String toString() {
        return "Square{" +
                "height=" + height +
                ", width=" + width +
                " #color "+color+ "# " +getAre()+'}';
    }
}
