/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author User
 */
public class LearningStage extends GridPane {

    public LearningStage() {
        setGridLinesVisible(true);
        setHgap(10);
        setAlignment(Pos.CENTER);
        Label stageName = new Label(":یادگیری");

        GridPane.setConstraints(stageName, 2, 0, 1, 1, HPos.RIGHT, VPos.CENTER, Priority.NEVER, Priority.ALWAYS);

        Label stepLabel = new Label("کاربرد حرف و در جلمات  ");
        GridPane.setConstraints(stepLabel, 1, 0, 1, 1, HPos.CENTER, VPos.CENTER);

        this.widthProperty().addListener(event -> {
            stageName.setStyle("-fx-font-size: " + this.getWidth() / 30);
            stepLabel.setStyle("-fx-font-size: " + this.getWidth() / 35);

        });

        Button prevBtn = new Button("Prev");
        GridPane.setConstraints(prevBtn, 0, 1, 1, 1, HPos.RIGHT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);

        Button noTextBtn = new Button("NoText");
        GridPane.setConstraints(noTextBtn, 0, 2, 1, 1, HPos.RIGHT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        GridPane.setMargin(noTextBtn, new Insets(0, 10, 0, 0));
//        AnchorPane prevAnch = new AnchorPane();

//        System.out.println(prevAnch.getMaxHeight());
//        prevAnch.getChildren().add(prevBtn);
        Button nextBtn = new Button("Next");
        GridPane.setConstraints(nextBtn, 2, 1, 1, 1, HPos.LEFT, VPos.CENTER, Priority.ALWAYS, Priority.NEVER);

        Button noAudioBtn = new Button("No Auido");
        GridPane.setConstraints(noAudioBtn, 2, 2, 1, 1, HPos.LEFT, VPos.CENTER, Priority.NEVER, Priority.NEVER);
        GridPane.setMargin(noAudioBtn, new Insets(0, 0, 0, 10));

//        setHgrow(stageName, Priority.ALWAYS);
//        add(prevAnch, 0, 1);
//        add(nextBtn,2,1);
        Rectangle rec = new Rectangle(600, 450);
        rec.setFill(Color.ANTIQUEWHITE);

        GridPane.setHalignment(rec, HPos.CENTER);
        GridPane.setValignment(rec, VPos.CENTER);
        GridPane.setMargin(rec, new Insets(0, 0, 20, 0));
//        setHgrow(rec, Priority.ALWAYS);
        add(rec, 1, 1, 1, 1);

        Label textImage = new Label("This is Just a Text! I Love the future and lets have some fun with it"
                + "This is Just a Text! I Love the future and lets have some fun with it"
                + "This is Just a Text! I Love the future and lets have some fun with it"
                + "This is Just a Text! I Love the future and lets have some fun with it"
                + "This is Just a Text! I Love the future and lets have some fun with it"
                + "This is Just a Text! I Love the future and lets have some fun with it"
                + "This is Just a Text! I Love the future and lets have some fun with it");
        textImage.setWrapText(true);
        HBox hBoxWrap = new HBox(textImage);
        hBoxWrap.setAlignment(Pos.CENTER);
        GridPane.setConstraints(hBoxWrap, 0, 3, 3, 1, HPos.CENTER, VPos.TOP, Priority.ALWAYS, Priority.ALWAYS);
        GridPane.setMargin(hBoxWrap, new Insets(0, 0, 0, 10));

        getChildren().addAll(stageName, nextBtn, prevBtn, hBoxWrap, noTextBtn, noAudioBtn, stepLabel);

    }

}
