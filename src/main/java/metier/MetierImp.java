package metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImp implements IMetier {
    //@Autowired
    //@Qualifier("dao")
    private IDao dao;

    public MetierImp(IDao dao){
        this.dao = dao;
    }
    @Override
    public double calculer() {
        double temp = dao.getData();
        double res=temp*540/Math.cos(temp*Math.PI);
        return res;
    }
    public void setDao(IDao dao){
        this.dao=dao;
    }
}
