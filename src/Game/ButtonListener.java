package Game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonListener implements ActionListener {


	private int x,y;
	private TicTacToeBoard tboard;

	public ButtonListener(TicTacToeBoard tboard, int x, int y) {
		this.tboard = tboard;
		this.x = x;
		this.y = y;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tboard.click(x,y);
	}
}


