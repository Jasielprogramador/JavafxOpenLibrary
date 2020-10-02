package ehu.isad;


import com.google.gson.Gson;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class ComboBoxExperiments extends Application {

    private Book book;

    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Open library API-a aztertzen");

        ComboBox comboBox = new ComboBox();
        comboBox.getItems().add("Blockchain: Blueprint for a New Economy");
        comboBox.getItems().add("R for Data Science");
        comboBox.getItems().add("Fluent Python");
        comboBox.getItems().add("Natural Language Processing with PyTorch");
        comboBox.getItems().add("Data Algorithms");


        //Te permite escribir
        comboBox.setEditable(false);
        comboBox.getSelectionModel().selectFirst();
        Text text=new Text();

        text.setText("Izenburua: " + this.book.getDetails().getTitle() + "\n" + "Orrialde kopurua: " + this.book.getDetails().getNumber_of_pages() + "\n" + "Argitaratzailea: " + this.book.getDetails().getPublishers());
        text.setX(200);
        text.setY(200);


        comboBox.setOnAction(e -> {

            System.out.println(comboBox.getValue());
            try {
                this.readFromUrl();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
            text.setText("Izenburua: "+this.book.getDetails().getTitle()+"\n"+"Orrialde kopurua: "+this.book.getDetails().getNumber_of_pages()+"\n"+"Argitaratzailea: "+this.book.getDetails().getPublishers());

        });

        VBox vbox = new VBox(comboBox,text);
        Scene scene = new Scene(vbox, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public void readFromUrl() throws IOException {
        URL api;
        String inputLine = "";

        try {
            api = new URL(" https://openlibrary.org/api/books?bibkeys=ISBN:9781491906187&jscmd=details&format=json");
            URLConnection yc = api.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            inputLine = in.readLine();

            Gson gson = new Gson();
            this.book = gson.fromJson(inputLine, Book.class);

            in.close();


        }
        catch (MalformedURLException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}