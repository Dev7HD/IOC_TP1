package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao;

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul() {
        double temp = dao.getData() * 10;
        return temp;
    }
}
