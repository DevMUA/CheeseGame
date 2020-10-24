/**
 * Created by DevM on 13-Jan-17.
 */
import com.badlogic.gdx.Game;
public class CheeseGame extends Game {
    public void create()    {
        CheeseMenu cm = new CheeseMenu(this);
        setScreen( cm );
    }
}