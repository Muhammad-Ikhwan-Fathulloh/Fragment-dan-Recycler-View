package com.fragmentrecylerview;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.visual.Swatch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class FragmentRecylerView extends MobileApplication {
    public static final String BASIC_VIEW = "Basic View";

    @Override
    public void init() {
        addViewFactory(HOME_VIEW, BasicView::new);
        
        addViewFactory(BASIC_VIEW, RecyclerView::new);
    }

    @Override
    public void postInit(Scene scene) {
        Swatch.BLUE.assignTo(scene);

        ((Stage) scene.getWindow()).getIcons().add(new Image(FragmentRecylerView.class.getResourceAsStream("/icon.png")));
    }
}
