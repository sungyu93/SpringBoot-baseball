package site.metacoding.baseball.domain.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Team {
	private Integer id;
	private String teamname;
	private Integer stadiumId;
	private Timestamp createDate;
	
	public Team(String teamname, Integer stadiumId) {
		this.teamname = teamname;
		this.stadiumId = stadiumId;
	}
	
	
}
