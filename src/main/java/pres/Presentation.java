package pres;

import ext.DaoImp2;
import metier.MetierImp;

public class Presentation {
    public static void main(String[] args) {
        DaoImp2 dao = new DaoImp2();
        MetierImp metier = new MetierImp(dao);
        //metier.setDao(dao);
        System.out.println("resultat = "+metier.calculer());
    }
}
