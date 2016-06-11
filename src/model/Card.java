package model;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.text.html.ImageView;
import java.io.File;
import java.net.URL;

/**
 * Created by Shantanu Mantri on 6/10/2016.
 * 万鳥シャンタヌが使ったコード 6月・10日・2016年
 * The basic structure of a Card object
 * カードオブジェクトの本体
 */
public class Card {
    private String entry;
    private String definition;
    private String fileLoc;
    private ImageView picture;

    /**
     * Constructor with Audio and Image Option
     * @param entry String the entry of the card
     * @param definition String the definition of the card
     * @param fileLoc String the location of the audio file
     * @param picture ImageView the image to be used
     */
    public Card(String entry, String definition, String fileLoc, ImageView picture) {
        this.entry = entry;
        this.definition = definition;
        this.fileLoc = fileLoc;
        this.picture = picture;
    }

    /**
     * Constructor with Image Option only
     * @param entry String the entry of the card
     * @param definition String the definition of the card
     * @param picture ImageView the image to be used
     */
    public Card(String entry, String definition, ImageView picture) {
        this.entry = entry;
        this.definition = definition;
        this.picture = picture;
    }

    /**
     * Constructor with Audio Option
     * @param entry the card entry
     * @param definition the definition of the entry
     * @param fileLoc the location of the audio file
     */
    public Card(String entry, String definition, String fileLoc) {
        this.entry = entry;
        this.definition = definition;
        this.fileLoc = fileLoc;
    }

    /**
     * Second Constructor without Audio Option
     * @param entry the card entry
     * @param definition the definition of the entry
     */
    public Card(String entry, String definition) {
        this.entry = entry;
        this.definition = definition;
        this.fileLoc = null;
    }

    /**
     * Gets the entry of the card
     * @return String the entry
     */
    public String getEntry() {
        return this.entry;
    }

    /**
     * Sets the entry of the card
     * @param input the new Entry of the card
     */
    public void setEntry(String input) {
        this.entry = input;
    }

    /**
     * Gets the definition of the card
     * @return String the definition of the card
     */
    public String getDefinition() {
        return this.definition;
    }

    /**
     * Sets the definition of the card
     * @param input String the new definition of the card
     */
    public void setDefinition(String input) {
        this.definition = input;
    }

    /**
     * Gets the location of the audio file
     * @return String the directory location
     */
    public String getLocation() {
        return this.fileLoc;
    }

    /**
     * Sets the location of the audio file
     * @param input the new directory location of the file
     */
    public void setLocation(String input) {
        this.fileLoc = input;
    }

    public ImageView getImage() {
        return this.picture;
    }

    public void setImage(ImageView newImage) {
        this.picture = newImage;
    }

    public MediaPlayer playSound() {
        FileChooser fc = new FileChooser();
        File file = fc.showOpenDialog(null);
        String path = file.getAbsolutePath();
        path = path.replace("\\", "/");
        try {
            Media media = new Media(new File(path).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(media);
            mediaPlayer.setAutoPlay(true);
            mediaPlayer.play();
            return mediaPlayer;
        } catch(Exception e) {
            System.out.println("Wrong File. Must be an audio file!");
            return null;
        }
    }
}
