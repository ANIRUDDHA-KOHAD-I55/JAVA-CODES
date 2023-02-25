import java.awt.Font;
import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
public class A_36 {
    String text = "Hello World";
    AffineTransform affinetransform = new AffineTransform();
    FontRenderContext frc = new FontRenderContext(affinetransform,true,true);
    Font font = new Font("Tahoma", Font.PLAIN, 12);
    int textwidth = (int)(font.getStringBounds(text, frc).getWidth());
    int textheight = (int)(font.getStringBounds(text, frc).getHeight());
}
