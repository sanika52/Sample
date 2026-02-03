import org.junit.*;
import java.beans.Transient;
public class addTest {
    @Test
    public void testForAdd() {
        add add_var = new add();
        Assert.assertEquals(7, add_var.addnumbers(4, 3));
        Assert.assertEquals(-7, add_var.addnumbers(-4, -3));
        Assert.assertEquals(201, add_var.addnumbers(201, 0));
    }

}
