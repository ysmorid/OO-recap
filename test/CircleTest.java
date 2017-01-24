import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ymoridza on 1/24/17.
 */
public class CircleTest {
    @Test
    public void ShouldCalculateArea(){
        int radius = 1;
        Circle circle = new Circle(radius);

        assertEquals(3.14, circle.area(), 0.01);
    }

}
