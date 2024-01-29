package in.kanha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.kanha.entiry.Cource;

public interface CourceRepository extends CrudRepository<Cource, Integer>{

	//select * from cource where cource_price >= : price
//	public List<Cource> findByCourcePriceGreaterThanEqual(Double d);
//	public List<Cource> findByCourcePriceLessThan(Double d1);
//	public List<Cource> findByCourcePriceGreaterThanEqualAndLessThanEqual(Double d1 , Double d2);
	
	//sql
//	@Query(value="select * from cource where cource_price <= 3500 and cource_price >= 1500" , nativeQuery = true)
//	public List<Cource> get();
	
	//hql
	@Query("from Cource c where c.courcePrice <= 3500 and c.courcePrice >= 1500 ")
	public  List<Cource> get();
}
