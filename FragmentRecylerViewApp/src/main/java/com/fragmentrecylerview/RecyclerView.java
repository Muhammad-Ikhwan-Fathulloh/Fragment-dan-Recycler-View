package com.fragmentrecylerview;

import com.gluonhq.charm.glisten.application.MobileApplication;
import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.NavigationDrawer;
import com.gluonhq.charm.glisten.control.CardPane;
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
import javafx.scene.text.*;
import javafx.scene.image.Image;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class RecyclerView extends View {
    
    public RecyclerView() {
        bola();
        bottom();
        
    }
    
    public void bola(){
        Image img_acm = new Image("/img_acm.png", 100, 100, false, false);
        ImageView iv1 = new ImageView();
        iv1.setImage(img_acm);
        Label label1 = new Label("AC Milan FC", iv1);
        label1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text1 = new Text();
                text1.setFont(new Font(12));
                text1.setWrappingWidth(300);
                text1.setTextAlignment(TextAlignment.JUSTIFY);
                text1.setText("Associazione Calcio Milan, sering disebut sebagai A.C. Milan atau hanya Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih, sehingga dijuluki rossoneri. ");

                VBox controls = new VBox(15.0, iv1, text1);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_arsenal = new Image("/img_arsenal.png", 100, 100, false, false);
        ImageView iv2 = new ImageView();
        iv2.setImage(img_arsenal);
        Label label2 = new Label("Arsenal FC", iv2);
        label2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text2 = new Text();
                text2.setFont(new Font(12));
                text2.setWrappingWidth(300);
                text2.setTextAlignment(TextAlignment.JUSTIFY);
                text2.setText("Arsenal Football Club adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. Didirikan pada 1886 dengan nama Dial Square. ");

                VBox controls = new VBox(15.0, iv2, text2);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_barca = new Image("/img_barca.png", 100, 100, false, false);
        ImageView iv3 = new ImageView();
        iv3.setImage(img_barca);
        Label label3 = new Label("Barcelona FC", iv3);
        label3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text3 = new Text();
                text3.setFont(new Font(12));
                text3.setWrappingWidth(300);
                text3.setTextAlignment(TextAlignment.JUSTIFY);
                text3.setText("Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol. ");

                VBox controls = new VBox(15.0, iv3, text3);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_bayern = new Image("/img_bayern.png", 100, 100, false, false);
        ImageView iv4 = new ImageView();
        iv4.setImage(img_bayern);
        Label label4 = new Label("Bayern Munchen FC", iv4);
        label4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text4 = new Text();
                text4.setFont(new Font(12));
                text4.setWrappingWidth(300);
                text4.setTextAlignment(TextAlignment.JUSTIFY);
                text4.setText("TFußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München, FC Bayern Minga, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bayern. ");

                VBox controls = new VBox(15.0, iv4, text4);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_chelsea = new Image("/img_chelsea.png", 100, 100, false, false);
        ImageView iv5 = new ImageView();
        iv5.setImage(img_chelsea);
        Label label5 = new Label("Chelsea FC", iv5);
        label5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text5 = new Text();
                text5.setFont(new Font(12));
                text5.setWrappingWidth(300);
                text5.setTextAlignment(TextAlignment.JUSTIFY);
                text5.setText("Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. ");

                VBox controls = new VBox(15.0, iv5, text5);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_city = new Image("/img_city.png", 100, 100, false, false);
        ImageView iv6 = new ImageView();
        iv6.setImage(img_city);
        Label label6 = new Label("Manchester City FC", iv6);
        label6.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text6 = new Text();
                text6.setFont(new Font(12));
                text6.setWrappingWidth(300);
                text6.setTextAlignment(TextAlignment.JUSTIFY);
                text6.setText("Manchester City Football Club adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880. ");

                VBox controls = new VBox(15.0, iv6, text6);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_madrid = new Image("/img_madrid.png", 100, 100, false, false);
        ImageView iv7 = new ImageView();
        iv7.setImage(img_madrid);
        Label label7 = new Label("Real Madrid FC", iv7);
        label7.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text7 = new Text();
                text7.setFont(new Font(12));
                text7.setWrappingWidth(300);
                text7.setTextAlignment(TextAlignment.JUSTIFY);
                text7.setText("Real Madrid Club de Fútbol, umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. ");

                VBox controls = new VBox(15.0, iv7, text7);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });
        
        Image img_mu = new Image("/img_mu.png", 100, 100, false, false);
        ImageView iv8 = new ImageView();
        iv8.setImage(img_mu);
        Label label8 = new Label("Manchester United FC", iv8);
        label8.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                Text text8 = new Text();
                text8.setFont(new Font(12));
                text8.setWrappingWidth(300);
                text8.setTextAlignment(TextAlignment.JUSTIFY);
                text8.setText("Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. ");

                VBox controls = new VBox(15.0, iv8, text8);
                controls.setAlignment(Pos.CENTER);
                setCenter(controls);
                
                kembalik();
                     
            }
        });       
        Label label = new Label("Football Club");
        label.setFont(new Font(20));
        
        CardPane card = new CardPane();
        card.getItems().addAll(label1, label2, label3, label4, label5, label6, label7, label8);
        //card.onMouseClickedProperty().addListener();
        
        VBox controls = new VBox(15.0, label, card);
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
    
    public void bottom(){
        BottomNavigationButton bnb1 = new BottomNavigationButton();
        bnb1.setGraphic(new Icon(MaterialDesignIcon.HOME));
        bnb1.setText("Home");
        bnb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                bola();
                     
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
        
        BottomNavigation bn = new BottomNavigation();
        bn.getActionItems().addAll(bnb1, bnb2, bnb3);
        
        NavigationDrawer nd = new NavigationDrawer();
        nd.getItems().addAll(bn);
              
        HBox bar = new HBox(nd);        
        bar.setAlignment(Pos.BASELINE_CENTER);       
        setBottom(bar);
    }
    
    public void kembalik(){
        Button kembali = new Button("Kembali");
        kembali.setGraphic(new Icon(MaterialDesignIcon.BACKSPACE));
        kembali.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
            bola();
            bottom();
          }
        });
        HBox bar = new HBox(kembali);        
        bar.setAlignment(Pos.CENTER);       
        setBottom(bar);
    }
    
    @Override
    protected void updateAppBar(AppBar appBar) {
        appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> MobileApplication.getInstance().switchView(FragmentRecylerView.HOME_VIEW)));
        appBar.setTitleText("Recycler View");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));
    } 
}
