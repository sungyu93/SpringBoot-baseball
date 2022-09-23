package site.metacoding.baseball.web.dto.request.team;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.team.Team;

@Setter
@Getter
public class SignDto {
	private String teamname;
	private Integer stadiumId;
	
	public Team toEntity() {
		Team team = new Team(this.teamname, this.stadiumId);
		return team;
	}
	
}
