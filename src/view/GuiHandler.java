package view;

import controller.GameController;

public class GuiHandler implements Runnable {

	private static GuiHandler instance;
	private GameController gameController;
	
	public static GuiHandler getInstance(GameController gameController) {
		if (instance == null) {
			new GuiHandler(gameController);
		}
		return instance;
	}
	
	private GuiHandler(GameController gameController) {
		this.gameController = gameController;
	}
	
	@Override
	public void run() {
		//TODO : Implement GUI
	}
}
