package reviewPackage;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {

	@Resource
	ReviewRepo repo;


	@RequestMapping("/reviews")
	public String fetchTravelReviews(Model model) {
		model.addAttribute("travelAsCollection", repo.findAll());
		return "travelReviews";
	}

	@RequestMapping("/singleReview")
	public String fetchSingleReview(@RequestParam("id") Long id, Model model) {
		model.addAttribute("singleReview", repo.findOne(id));
		return "singleReview";
	}

}
