/**
 * Created by DevM on 13-Jan-17.
 */
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;

public class CheeseLauncher {
    public static void main (String[] args)    {
        CheeseGame myProgram = new CheeseGame();
        LwjglApplication launcher = new LwjglApplication( myProgram );
    }
}