package action;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Actionforward {
	//return 페이지이동방식(true,false), 페이지(String)
	
	private boolean isRedirect; //변수 지정
	private String path;
	
}
