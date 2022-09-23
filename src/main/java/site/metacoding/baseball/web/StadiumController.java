package site.metacoding.baseball.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.request.stadium.SignDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;
import site.metacoding.baseball.web.dto.response.stadium.ListDto;

@RequiredArgsConstructor
@RestController
public class StadiumController {
	private final HttpSession session;
	private final StadiumService stadiumService;
	
	@PostMapping("/api/stadium/sign")
	public String sign(SignDto signDto) {
		stadiumService.야구장등록하기(signDto);
		return "야구장 추가 완료";
	}
	
	@GetMapping("/api/stadium")
	public List<Stadium> stadiumList() {
		List<Stadium> stadiumList = stadiumService.야구장목록보기();
		return stadiumList;
	}
	
	@DeleteMapping("/api/stadium/delete/{id}")
	public String delete(@PathVariable Integer id) {
		stadiumService.야구장삭제하기(id);
		return "야구장 삭제 완료";	
	}

}
