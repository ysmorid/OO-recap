import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class RectangleTest {
    int width;
    int height;
    Rectangle rectangle;

    @Before
    public void setUp() {
        width = 2;
        height = 2;
        rectangle = new Rectangle(width, height);
    }

    @Test
    public void shouldReturnArea(){
        assertEquals(4, rectangle.area());
    }

    @Test
    public void shouldReturnPerimeter(){
        assertEquals(8, rectangle.perimeter());
    }

    @Test
    public void shouldGenerateSquare() {
        int side = 1;
        Rectangle square = Rectangle.generateSquare(side);
        assertEquals(4, square.perimeter());
    }

}
