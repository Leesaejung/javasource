package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter@Getter
public class ActionForward {
	// send 로 갈지 post로 갈지 이동방향
	private boolean isRedirect;
	private String path;
}
