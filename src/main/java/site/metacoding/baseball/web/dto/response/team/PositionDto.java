package site.metacoding.baseball.web.dto.response.team;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PositionDto {
	private Integer id;
	private String stadiumname;
	private String teamname;
	private Integer stadiumId;
	private Timestamp createDate;
}
