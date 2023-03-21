package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("daoWS")

public class DaoImpWS implements IDao {
    @Override
    public double getData() {
        System.out.println("version web");
        return 90;
    }
}
