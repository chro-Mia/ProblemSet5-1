import TurtleGraphics.*;

public class ProblemD{
    public static void koch(int n, double len, StandardPen p) {
        if (n == 0) {
            p.move(len);
            return;
        }

        double segment = len / 3.0;

        koch(n - 1, segment, p);
        p.turn(60);
        koch(n - 1, segment, p);
        p.turn(-120);
        koch(n - 1, segment, p);
        p.turn(60);
        koch(n - 1, segment, p);
    }

    public static void main(String[] args) {
        SketchPadWindow window = new SketchPadWindow(500, 500);
        StandardPen pen = new StandardPen(window);

        pen.up();
        pen.turn(-90);
        pen.move(-200);
        pen.down();

        koch(2, 400, pen);
    }
}