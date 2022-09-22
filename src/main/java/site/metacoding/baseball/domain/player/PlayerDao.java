package site.metacoding.baseball.domain.player;

import java.util.List;

public interface PlayerDao {
	public void insert(Player player); // 선수등록
	public List<Player> findAll(); // 선수목록
	public void deleteById(Integer id); // 선수 삭제
	
	public Player findById(Integer id); // 
	public void update(Player player); // 선수 인적사항 변경

}
