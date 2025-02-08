import java.awt.*;
import java.util.ArrayList;

class RectangleFilter implements Filter {

    @Override
    public boolean accept(Object x) {
        if (x instanceof Rectangle) {
            Rectangle rect = (Rectangle) x;
            int perimeter = 2 * (rect.width + rect.height);
            return perimeter > 10;
        }
        return false;
    }
}

    public class BigRectLister {
    public static void main(String[] args) {

        Filter filter = new RectangleFilter();
        ArrayList rectangles = new ArrayList();

        //small
        rectangles.add(new Rectangle(2, 2));
        rectangles.add(new Rectangle(1, 2));
        rectangles.add(new Rectangle(2, 1));
        rectangles.add(new Rectangle(1, 1));
        rectangles.add(new Rectangle(1, 3));

        //big
        rectangles.add(new Rectangle(4, 3));
        rectangles.add(new Rectangle(5, 2));
        rectangles.add(new Rectangle(1, 7));
        rectangles.add(new Rectangle(6, 6));
        rectangles.add(new Rectangle(4, 7));

        for (Object rect : rectangles) {
            if (filter.accept(rect)) {
                System.out.println(rect.toString());
            }
        }




    }
}
