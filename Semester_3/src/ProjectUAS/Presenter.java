package ProjectUAS;

public class Presenter {
    private View view;
    private Model model;

    public Presenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void login(String pass) {
        String result = "Incorrect Password";

        if (model.getPassword().equals(pass)) {
            result = "Correct Password";
        }

        view.updateStatusLabel(result);
    }
}
