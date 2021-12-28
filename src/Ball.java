import java.awt.Color;

public class Ball extends Sprite {
	private static final Color BALL_COLOUR = Color.BLACK;
	private static final int BALL_WIDTH = 25;
	private static final int BALL_HEIGHT = 25;
	
	public Ball(int panelWidth, int panelHeight) {
		setColour(BALL_COLOUR);
		setWidth(BALL_WIDTH);
		setHeight(BALL_HEIGHT);
		
		// centers center of ball with center of panel
		setInitialPosition(panelWidth / 2 - (getWidth() / 2), panelHeight / 2 - (getHeight() / 2));
		
		resetToInitialPosition();
	}
}
