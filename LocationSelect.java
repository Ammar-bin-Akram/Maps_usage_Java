import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javax.swing.*;
import java.awt.*;

public class LocationSelect extends JFrame {

    public LocationSelect() {
        JFXPanel jfxPanel = new JFXPanel();
        getContentPane().add(jfxPanel, BorderLayout.CENTER);

        Platform.runLater(() -> {
            WebView webView = new WebView();
            jfxPanel.setScene(new Scene(webView));
            webView.getEngine().load("https://maps.google.com?key=AIzaSyCfj5fiB4_-QcYMBeWvXTUg--a6gTfTcqc");
        });

        setTitle("Google Maps in Java Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new LocationSelect().setVisible(true));
    }
}


