package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao {
    @Override
    public double getData() {
        /*
        se connecter a la bd pour recuperer la temperature
        */
        System.out.println("Version base donnees");
        double temp = Math.random()*40;
        return temp ;
    }
}
