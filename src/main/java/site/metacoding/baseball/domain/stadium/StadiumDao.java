package site.metacoding.baseball.domain.stadium;

import java.util.List;

import site.metacoding.baseball.web.dto.response.stadium.MainDto;

public interface StadiumDao {
	public void insert(Stadium stadium); // 야구장등록
	public List<MainDto> findAll(); // 야구장목록
	public void deleteById(Integer id); // 야구장 삭제
	
	public Stadium findById(Integer id); // 선수 찾기
	public void update(Stadium stadium); // 선수 업데이트

}
