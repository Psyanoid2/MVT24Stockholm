package UppgiftOOP.Rektangel;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    void testArea(){
        Rectangle rectangle = new Rectangle(10,20);
        assertEquals(200,rectangle.calculateArea());
    }

    @Test
    void testPerimeter(){
        Rectangle rectangle = new Rectangle(10,20);
        assertEquals(60,rectangle.calculatePerimeter());
    }

}
