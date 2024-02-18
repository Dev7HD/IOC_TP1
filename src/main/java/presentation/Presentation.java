package presentation;

import dao.DaoImpl;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;

public class Presentation {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        IDao d = new DaoImpl();
        metier.setDao(d);
        System.out.println("Res = " + metier.calcul());
    }
}
