package com.tobias.cisco.configchecker.gui;

import com.tobias.cisco.configchecker.config.ConfigLoader;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;


public class MainWindowController {
    @FXML
    private Button selectFile;

    private static Stage stage;
    private File configFile;



    private FileChooser fileChooser = new FileChooser();

    public void initialize() {

    }

    public static void setStageInstance(Stage stageInstance) {
        stage = stageInstance;
    }

    public void onSelectFileClick(){
        fileChooser.setTitle("Open Config File");
        this.configFile = fileChooser.showOpenDialog(stage);
        ConfigLoader configLoader = new ConfigLoader();
        configLoader.load(configFile);
        configLoader.getconfig();
    }

}