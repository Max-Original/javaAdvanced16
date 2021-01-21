package hw.shared;

import java.util.ArrayList;
import java.util.List;

public interface AbstractCRUD<T> {

	
	T creat(T t);

	T read(Integer id);

	T update(T t);

	void delete(int id);
	
	List<T> readAll();
}
