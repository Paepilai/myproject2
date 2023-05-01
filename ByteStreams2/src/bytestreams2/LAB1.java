package bytestreams2;

public class LAB1 {

    public static void main(String[] args) {
        Circle c = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(c);
        redCircle.draw();

        Rectangle r = new Rectangle();
        RedShapeDecorator redRectangle = new RedShapeDecorator(r);
        redRectangle.draw();
    }

}
