import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Robot;
import java.util.Timer;
import java.util.TimerTask;

public class AntiSperr extends TimerTask {

	public void run() {
		// TODO Auto-generated constructor stub
		try {
			Robot rob = new Robot();
			Point m = MouseInfo.getPointerInfo().getLocation();
			int r = (int) ((Math.random()-0.5)*10.);
			rob.mouseMove(m.x+r, m.y+r);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AntiSperr();
		Timer timer = new Timer();
		timer.schedule( new AntiSperr(), 0 , 250);
	}

}
