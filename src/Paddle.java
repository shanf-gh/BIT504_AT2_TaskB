import java.awt.Color;

public class Paddle extends Sprite {
	static final int PADDLE_WIDTH = 10;
	static final int PADDLE_HEIGHT = 100;
	static final Color PADDLE_COLOUR = Color.BLACK;
	static final int PADDLE_DIST_FROM_EDGE = 40;
	
	public Paddle(Player player, int panelWidth, int panelHeight) {
		setWidth(PADDLE_WIDTH);
		setHeight(PADDLE_HEIGHT);
		setColour(PADDLE_COLOUR);
		
		// set initial position
		int xPos = -1;
		if(player == Player.One) {
			xPos = PADDLE_DIST_FROM_EDGE;
		} else if (player == Player.Two) {
			xPos = panelWidth - PADDLE_DIST_FROM_EDGE - getWidth();
		}
		
		setInitialPosition(xPos, panelHeight / 2 - (getHeight() / 2));
		
		resetToInitialPosition();		
	}
}
