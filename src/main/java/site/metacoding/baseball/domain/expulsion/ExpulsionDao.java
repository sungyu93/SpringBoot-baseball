package site.metacoding.baseball.domain.expulsion;

import java.util.List;

public interface ExpulsionDao {
	public void insert(Expulsion expulsion); // 퇴출선수 등록
	public List<Expulsion> findAll(); // 퇴출 선수 목록 페이지
	
	public void deleteById(Integer id); 
	public Expulsion findById(Integer id); 
	public void update(Expulsion expulsion); 
}
