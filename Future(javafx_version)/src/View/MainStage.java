/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListCell;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class MainStage extends Stage {

    Pane root;
    VBox toolBar;
    HBox details;
    private static double toolbarWidth = 80;
    private static double detailsHeight = 40;
    private LearningStage ls;

    public MainStage() {
        this.setWidth(1024);
        this.setHeight(768);

        //create root node
        root = new Pane() {
            @Override
            protected void layoutChildren() {
                double w = getWidth();
                double h = getHeight();
                details.resizeRelocate(0, 0, w, detailsHeight);
                details.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                toolBar.resizeRelocate(0, 0, toolbarWidth, h);
                toolBar.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                ls.resizeRelocate(toolbarWidth, detailsHeight, w - toolbarWidth, h - detailsHeight);
            }
        };

        ls = new LearningStage();
        toolBar = new VBox();
        details = new HBox();
        details.setAlignment(Pos.CENTER_RIGHT);

        ComboBox steps = new ComboBox();
        steps.getItems().addAll("first", "second");// it should uses from the labels for correcting the alligments
        steps.setValue(steps.getItems().get(0));
        steps.getStylesheets().add(
                getClass().getResource(
                        "combo-size.css"
                ).toExternalForm()
        );

        details.getChildren().addAll(steps);

        root.getChildren().addAll(details, toolBar, ls);
        Scene scene = new Scene(root);
        this.setTitle("کلمه");
        this.setScene(scene);
        this.show();

    }

}
