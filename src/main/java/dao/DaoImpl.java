package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        System.out.println("Version Base de bonnees");
        double temp = 33;
        return temp;
    }
}
