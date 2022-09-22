package site.metacoding.baseball.domain.team;

import java.util.List;

public interface TeamDao {
	public void insert(Team team); // 팀등록
	public List<Team> findAll(); // 팀목록
	public void deleteById(Integer id); // 팀삭제
	
	public Team findById(Integer id); // 선수 찾기
	public void update(Team team); // 선수 업데이트
}
