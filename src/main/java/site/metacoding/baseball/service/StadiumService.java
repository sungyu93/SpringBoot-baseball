package site.metacoding.baseball.service;

import java.util.List;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import site.metacoding.baseball.domain.stadium.Stadium;
import site.metacoding.baseball.domain.stadium.StadiumDao;
import site.metacoding.baseball.web.dto.request.stadium.JoinDto;
import site.metacoding.baseball.web.dto.response.stadium.MainDto;

@RequiredArgsConstructor
@Service
public class StadiumService {
	private final StadiumDao stadiumDao;
	
	public void 야구장등록하기(JoinDto joinDto) {
		Stadium stadium = joinDto.toEntity();
		stadiumDao.insert(stadium);
	}
	
	public List<MainDto> 야구장목록보기(Stadium stadium) {
		List<MainDto> stadiumList = stadiumDao.findAll();
		return stadiumList;
	}
	public void 야구장삭제하기() {}
}
