package site.metacoding.baseball.web.dto.request.stadium;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.baseball.domain.stadium.Stadium;

@Setter
@Getter
public class SignDto {
	private String stadiumname;
	
	public Stadium toEntity() {
		Stadium stadium = new Stadium(this.stadiumname);
		return stadium;
	}
}
