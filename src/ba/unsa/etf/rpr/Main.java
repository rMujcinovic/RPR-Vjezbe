package ba.unsa.etf.rpr;

import java.io.File;
import java.util.Scanner;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.scene.layout.Region.USE_COMPUTED_SIZE;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GeografijaDAO.removeInstance();
        File dbfile = new File("baza.db");
        dbfile.delete();
        GeografijaDAO geo=GeografijaDAO.getInstance();
        Parent root = FXMLLoader.load(getClass().getResource("izbor.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("GUI");
        primaryStage.setScene(new Scene(root, USE_COMPUTED_SIZE, USE_COMPUTED_SIZE));
        primaryStage.show();
    }

    public static void main(String[] args) {
        /*System.out.println(ispisiGradove());
        glavniGrad();*/
        launch(args);
    }

    private static void glavniGrad() {
        GeografijaDAO.removeInstance();
        File dbfile = new File("baza.db");
        dbfile.delete();
        GeografijaDAO dao = GeografijaDAO.getInstance();
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite naziv države:");
        String nazivDrzave = ulaz.nextLine();
        if (dao.nadjiDrzavu(nazivDrzave) == null) System.out.println("Nepostojeća država");
        else {
            Drzava drzava = dao.nadjiDrzavu(nazivDrzave);
            System.out.println("Glavni grad države " + drzava.getNaziv() + " je " + drzava.getGlavniGrad().getNaziv());
        }
    }

    public static String ispisiGradove() {
        GeografijaDAO.removeInstance();
        File dbfile = new File("baza.db");
        dbfile.delete();
        GeografijaDAO dao = GeografijaDAO.getInstance();
        String sadrzaj = "";
        for (Grad grad : dao.gradovi()) {
            sadrzaj += grad.getNaziv();
            sadrzaj += " ";
            sadrzaj += "(";
            sadrzaj += grad.getDrzava().getNaziv();
            sadrzaj += ") - ";
            sadrzaj += grad.getBrojStanovnika();
            sadrzaj += "\n";
        }
        return sadrzaj;
    }
}
