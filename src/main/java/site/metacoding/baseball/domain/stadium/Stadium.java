package site.metacoding.baseball.domain.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Stadium {

	private Integer id;
	private String stadiumname;
	private 	Timestamp createDate;
	
	public Stadium(String stadiumname) {
		this.stadiumname = stadiumname;
	}

}
