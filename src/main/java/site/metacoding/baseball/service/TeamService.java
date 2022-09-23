package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.team.Team;
import site.metacoding.baseball.domain.team.TeamDao;
import site.metacoding.baseball.web.dto.request.team.SignDto;
import site.metacoding.baseball.web.dto.response.team.PositionDto;

@RequiredArgsConstructor
@Service
public class TeamService {
	private final TeamDao teamDao;
	
	public void 팀등록하기(SignDto signDto) {
		Team team = signDto.toEntity();
		teamDao.insert(team);
	}
	
	public List<Team> 팀목록보기() {
		return teamDao.findAll();
	}
	public void 팀삭제하기(Integer id) {
		teamDao.deleteById(id);
	}
	
	public void 포지션별팀의야구선수(PositionDto positionDto) {
	}

}
