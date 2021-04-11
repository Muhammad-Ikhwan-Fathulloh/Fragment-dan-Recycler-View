package com.fragmentrecylerview;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.NavigationDrawer;
import com.gluonhq.charm.glisten.control.BottomNavigation;
import com.gluonhq.charm.glisten.control.BottomNavigationButton;
import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class BasicView extends View {

    public BasicView() {
        
        BottomNavigationButton bnb1 = new BottomNavigationButton();
        bnb1.setGraphic(new Icon(MaterialDesignIcon.HOME));
        bnb1.setText("Home");
        bnb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                home();
            }
        });
        
        BottomNavigationButton bnb2 = new BottomNavigationButton();
        bnb2.setGraphic(new Icon(MaterialDesignIcon.FAVORITE));
        bnb2.setText("Favorite");
        bnb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                favourite();
                     
            }
        });
        
        BottomNavigationButton bnb3 = new BottomNavigationButton();
        bnb3.setGraphic(new Icon(MaterialDesignIcon.PERSON));
        bnb3.setText("About");
        bnb3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                about();
                       
            }
        });
        
        
        home();
       
        BottomNavigation bn = new BottomNavigation();
        bn.getActionItems().addAll(bnb1, bnb2, bnb3);
        
        NavigationDrawer nd = new NavigationDrawer();
        nd.getItems().addAll(bn);
        
        HBox bar = new HBox(nd); 
        bar.setAlignment(Pos.CENTER);
        setBottom(bar);
        
    }
    
    public void home(){
        Label label = new Label("Home");
        TextField npm = new TextField();
        npm.setPromptText("Masukkan NPM");
        
        TextField nama = new TextField();
        nama.setPromptText("Masukkan Nama");
        
        Button kirim = new Button("Kirim");
        kirim.setGraphic(new Icon(MaterialDesignIcon.SEND));
        kirim.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
                     
            }
        });
        
        VBox controls = new VBox(15.0, label, npm, nama, kirim);
        controls.setAlignment(Pos.CENTER);
        setCenter(controls);
    }
    
    public void favourite(){
        Label label = new Label("Favourite");
        TextField npm = new TextField();
        npm.setPromptText("Masukkan NPM");
        
        TextField nama = new TextField();
        nama.setPromptText("Masukkan Nama");
        
        Button kirim = new Button("Kirim");
        kirim.setGraphic(new Icon(MaterialDesignIcon.SEND));
        kirim.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
                     
            }
        });
        
        VBox controls = new VBox(15.0, label, npm, nama, kirim);
        controls.setAlignment(Pos.CENTER);
        setCenter(controls);
    }
    
    public void about(){
        Label label = new Label("About");
        Label npm = new Label("NPM : 19552011024");
        Label nama = new Label("Nama : Muhammad Ikhwan Fathulloh");
//        TextField npm = new TextField("19552011024");
//        npm.setPromptText("Masukkan");
//        TextField nama = new TextField("Muhammad Ikhwan Fathulloh");
//        nama.setPromptText("Masukkan Nama");
        
        Button kirim = new Button("Kirim");
        kirim.setGraphic(new Icon(MaterialDesignIcon.SEND));
        kirim.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                
                     
            }
        });
        
        VBox controls = new VBox(15.0, label, npm, nama);
        controls.setAlignment(Pos.CENTER);
        setCenter(controls);
    }

    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> MobileApplication.getInstance().switchView(FragmentRecylerView.BASIC_VIEW)));
        appBar.setTitleText("Fragment View");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    }
    
}
