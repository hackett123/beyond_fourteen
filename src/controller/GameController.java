package controller;

import javax.swing.SwingUtilities;

import model.ModelManager;
import view.GuiHandler;

public class GameController {

    private static GameController instance;
    private ModelManager modelManager;
    private GuiHandler guiHandler;

    public static GameController getInstance() {
        if (instance == null) {
            instance = new GameController();
        }
        return instance;
    }

    private GameController() {
        this.modelManager = ModelManager.getInstance(instance);
        SwingUtilities.invokeLater(this.guiHandler = GuiHandler.getInstance(instance));
    }
}
