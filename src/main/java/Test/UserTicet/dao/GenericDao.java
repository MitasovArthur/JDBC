package Test.UserTicet.dao;

public interface GenericDao<T> {
    T getById(int id);
    boolean add(T t);
}
