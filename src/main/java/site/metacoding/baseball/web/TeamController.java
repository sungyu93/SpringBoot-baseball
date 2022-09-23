package site.metacoding.baseball.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.service.TeamService;
import site.metacoding.baseball.web.dto.request.team.SignDto;

@RequiredArgsConstructor
@RestController
public class TeamController {
	
	private final HttpSession session;
	private final TeamService teamService;
	
	@PostMapping("/api/team/sign")
	public String sign(SignDto signDto) {
		teamService.팀등록하기(signDto);
		return "팀 추가 완료";
	}
	
	@GetMapping("/api/team")
	public List<Team> teamList() {
		List<Team> teamList = teamService.팀목록보기();
		return teamList;
	}
	
	@DeleteMapping("/api/team/delete/{id}")
	public String delete(@PathVariable Integer id) {
		teamService.팀삭제하기(id);
		return "팀 삭제 완료";	
	}

}
