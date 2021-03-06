package edu.uslt.cs.thesis.gis.gui.panels;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.ImageTextButton;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import edu.uslt.cs.thesis.gis.gui.Panel;
import edu.uslt.cs.thesis.gis.util.constant.Option;

public class MenuPanel implements Panel {

    private Table menuTable;

    public MenuPanel(Skin skin, String[][] buttonName) {
        menuTable = new Table(skin);
        menuTable.setBackground("container");
        menuTable.setVisible(false);
        menuTable.pad(5);
        setName(Option.MENU_OPTION);

        for (int i = 0; i < buttonName[0].length; i++) {
            ImageTextButton imageTextButton = new ImageTextButton(buttonName[0][i], skin, buttonName[1][i]);
            imageTextButton.setChecked(false);
            imageTextButton.getLabelCell().minSize(0).prefSize(0);
            imageTextButton.setName(buttonName[0][i]);
            menuTable.add(imageTextButton).minSize(0, 0).pad(1).row();
        }
    }

    public Actor getChildren(Actor actor) {
        if (menuTable.getChildren().contains(actor, true)) {
            return actor;
        }
        return null;
    }

    public Actor getChildren(int id) {
        return menuTable.getChildren().get(id);
    }

    @Override
    public void setName(String name) {
        menuTable.setName(name);
    }

    public int size() {
        return menuTable.getChildren().size;
    }

    @Override
    public void hide() {
        menuTable.setVisible(false);
    }

    @Override
    public void show() {
        menuTable.setVisible(true);
    }

    @Override
    public String getName() {
        return menuTable.getName();
    }

    public Table getTable() {
        return menuTable;
    }

}
