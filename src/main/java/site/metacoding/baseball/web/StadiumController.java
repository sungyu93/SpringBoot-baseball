package site.metacoding.baseball.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.service.StadiumService;
import site.metacoding.baseball.web.dto.request.stadium.JoinDto;
import site.metacoding.baseball.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class StadiumController {
	private final HttpSession session;
	private final StadiumService stadiumService;
	
	@PostMapping("/join")
	public @ResponseBody CMRespDto<?> join(JoinDto joinDto) {
		stadiumService.야구장등록하기(joinDto);
		return new CMRespDto<>(1, "야구장 등록 성공", null);
	}

}
