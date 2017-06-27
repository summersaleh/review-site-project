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
		Review iceland = new Review(1234, "Iceland", "images/iceland2.jpg",
				"Click on the title to read my review of Iceland!", "images/Iceland.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, seddo eiusmod tempor incididunt ut labore et dolore magna aliqua. Utenim ad minim veniam, quis nostrud exercitation ullamco laboris nisiut aliquip ex ea commodo consequat. Duis aute irure dolor inreprehenderit in voluptate velit esse cillum dolore eu fugiat nullapariatur. Excepteur sint occaecat cupidatat non proident, sunt inculpa qui officia deserunt mollit anim id est laborum");
		travel.put(1234L, iceland);

		Review germany = new Review(1235, "Germany", "images/Germany.jpg",
				"Click on the title to read my review of Germany!", "images/germany2.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, seddo eiusmod tempor incididunt ut labore et dolore magna aliqua. Utenim ad minim veniam, quis nostrud exercitation ullamco laboris nisiut aliquip ex ea commodo consequat. Duis aute irure dolor inreprehenderit in voluptate velit esse cillum dolore eu fugiat nullapariatur. Excepteur sint occaecat cupidatat non proident, sunt inculpa qui officia deserunt mollit anim id est laborum");
		travel.put(1235L, germany);

		Review spain = new Review(1236, "Spain", "images/spain2.jpg", "Click on the title to read my review of Spain!",
				"images/spain.jpg",
				"Lorem ipsum dolor sit amet, consectetur adipisicing elit, seddo eiusmod tempor incididunt ut labore et dolore magna aliqua. Utenim ad minim veniam, quis nostrud exercitation ullamco laboris nisiut aliquip ex ea commodo consequat. Duis aute irure dolor inreprehenderit in voluptate velit esse cillum dolore eu fugiat nullapariatur. Excepteur sint occaecat cupidatat non proident, sunt inculpa qui officia deserunt mollit anim id est laborum");
		travel.put(1236L, spain);

	}

	public Collection<Review> findAll() {
		return travel.values();

	}

	public Review findOne(Long id) {
		return travel.get(id);

	}

}
