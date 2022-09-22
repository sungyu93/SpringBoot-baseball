package site.metacoding.baseball.web.dto.response.stadium;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MainDto {
	private Integer id;
	private String stadiumname;
	private Timestamp createDate;
}
