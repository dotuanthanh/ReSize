package Square;

public class Main {
    public static void main(String[] args) {
        Square[] square = new Square[2];
      square[0]= new Square(1,5,"red");
      square[1]= new Square(4,5, "blue");
        for (Square o : square){
            System.out.println(o);
    }
}}
