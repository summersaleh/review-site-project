package reviewPackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class ReviewRepo {

	protected Map<Long, Review> travel = new HashMap<>();

	public ReviewRepo() {
		Review iceland = new Review(1234, "Iceland","images/iceland2.jpg", "Click on the title to read my review of Iceland!");
		travel.put(1234L, iceland);
		
		Review germany = new Review(1235, "Germany","images/Germany.jpg", "Click on the title to read my review of Germany");
	     travel.put(1235L, germany);
	     
	     Review spain = new Review(1236, "Spain","images/spain2.jpg", "Click on the title to read my review of Spain");
	     travel.put(1236L, spain);
	     
	}
	
	

	
	public Collection<Review> findAll(){
		return travel.values();
		
	}
	
	public Review findOne(Long id) {
		return travel.get(id);
		
	}
	
}
