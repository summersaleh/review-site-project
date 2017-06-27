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

	 @RequestMapping("/1234")
	 public String icelandReview(@RequestParam(value = "1234", required = false) String title,
	 Model model) {
	 model.addAttribute("1234", title);
	 return "iceland";
	 }
	
	@RequestMapping("/1235")
	public String germanyReview(@RequestParam(value = "1235", required = false) String title, Model model) {
		model.addAttribute("1235", title);
		return "germany";
	}

	@RequestMapping("/1236")
	public String spainReview(@RequestParam(value = "1236", required = false) String title, Model model) {
		model.addAttribute("1236", title);
		return "spain";
	}

	@RequestMapping("/reviews")
	public String fetchtravelReviews(Model model) {
		model.addAttribute("travelAsCollection", repo.findAll());
		return "travelReviews";
	}

	@RequestMapping("/singleReview")
	public String fetchSingleReview(@RequestParam("id") Long id, Model model) {
		Review countries = repo.findOne(id);
		model.addAttribute(countries);
//		model.addAttribute("travelAsCollection", repo.findOne(1234L));
		return "singelReview";
	}

}
