package paciente.dao;

import java.util.List;

public interface IDao<T>{
    public T salvar(T t);

}