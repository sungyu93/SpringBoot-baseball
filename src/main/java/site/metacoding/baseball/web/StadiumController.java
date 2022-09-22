package site.metacoding.baseball.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.request.stadium.SignDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.stadium.ListDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	private final HttpSession session;
	private final StadiumService stadiumService;
	
	@PostMapping("/sign")
	public @ResponseBody CMRespDto<?> sign(SignDto signDto) {
		stadiumService.야구장등록하기(signDto);
		return new CMRespDto<>(1, "야구장 등록 성공", null);
	}
	
	@GetMapping({"/","/stardium"})
	public String getStadiumList(Model model) {
		List<ListDto> stadiumList = stadiumService.야구장목록보기();
		model.addAttribute("stadiumList", stadiumList);
		return "/stadium/list";
	
	}

}
