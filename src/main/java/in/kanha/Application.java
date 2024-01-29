package in.kanha;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.kanha.entiry.Cource;
import in.kanha.repository.CourceRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		
		CourceRepository bean = run.getBean(CourceRepository.class);
		
//-------------------------------------------------------------------------------------	
//		// save(Entity object)
//		Cource cource = new Cource();
//		cource.setCourceID(101);
//		cource.setCourceName("java");
//		cource.setCourcePrice(15000.00);
//		
//		bean.save(cource);
//		System.out.println("save successfull...");
		
//-------------------------------------------------------------------------------------		
		// saveAll(Iterable)
//		Cource c1 = new Cource();
//		c1.setCourceID(102);
//		c1.setCourceName("Python");
//		c1.setCourcePrice(2500.25);
//		
//		Cource c2 = new Cource();
//		c2.setCourceID(103);
//		c2.setCourceName("Mern");
//		c2.setCourcePrice(3500.25);
//		
//		Cource c3 = new Cource();
//		c3.setCourceID(104);
//		c3.setCourceName("Appitute");
//		c3.setCourcePrice(1500.25);
//		
//		Cource c4 = new Cource();
//		c4.setCourceID(105);
//		c4.setCourceName("AWS");
//		c4.setCourcePrice(4500.25);
//		
//		bean.saveAll(Arrays.asList(c1,c2,c3,c4));
//		System.out.println("Save Successfull...");
		
//---------------------------------------------------------------------------------------		
		//existById(id)
//		boolean status = bean.existsById(109);
//		if(status) System.out.println("present");
//		else System.out.println("not present...");
		
//--------------------------------------------------------------------------------------
		//count()
//		long count = bean.count();
//		System.out.println(count);
		
//---------------------------------------------------------------------------------------		
		//findById(id)
//		Optional<Cource> byId = bean.findById(105);
//		System.out.println(byId.get());
		
//--------------------------------------------------------------------------------------
		//findAllById(Iterable)
//		Iterable<Cource> allById = bean.findAllById(Arrays.asList(101,102,103));
//		for(Cource c : allById)
//		{
//			System.out.println(c);
//		}
		
//--------------------------------------------------------------------------------------
		//findAll()
//		Iterable<Cource> all = bean.findAll();
//		for(Cource c : all)
//		{
//			System.out.println(all);
//		}
		
//---------------------------------------------------------------------------------------		
		//delectById(id)
//		if(bean.existsById(205))
//		{
//		bean.deleteById(205);
//		}
//		else {
//			System.out.println("records is not present..");
//		}
		
//-------------------------------------------------------------------------------------
		//delectAllById(Iterable)
		
//-------------------------------------------------------------------------------------
		
//		List<Cource> list = bean.findByCourcePriceGreaterThanEqual(3500.00);
//		for(Cource c : list)
//		{
//			System.out.println();
//		}
		
		List<Cource> list = bean.get();
		for(Cource c : list)
		{
			System.out.println(c);
		}
	}

}
