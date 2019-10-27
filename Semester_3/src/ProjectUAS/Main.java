package ProjectUAS;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            View view = new View();
            view.setPresenter(new Presenter(view, new Model()));
        });
    }
}

