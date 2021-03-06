package edu.uslt.cs.thesis.gis.gui.panels;

import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

import edu.uslt.cs.thesis.gis.util.constant.Option;


public class ZoomPanel implements edu.uslt.cs.thesis.gis.gui.Panel {

    private Table table;
    public Button zoomIn;
    public Button zoomOut;

    public ZoomPanel(Skin skins, int width, int height) {
        zoomIn = new Button(skins, "zoom-in");
        zoomOut = new Button(skins, "zoom-out");

        table = new Table();
        setName(Option.ZOOM_OPTION);
        table.top().right();
        table.add(zoomIn).minSize(0).prefSize(width * .07f, height * .09f).row();
        table.add(zoomOut).minSize(0).prefSize(width * .07f, height * .09f);
    }


    public Table getTable() {
        return table;
    }

    @Override
    public void hide() {
        table.setVisible(false);
    }

    @Override
    public void setName(String name) {
        table.setName(name);
    }

    @Override
    public String getName() {
        return table.getName();
    }

    @Override
    public void show() {
        table.setVisible(false);
    }
}
