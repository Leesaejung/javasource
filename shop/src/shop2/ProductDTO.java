package shop2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//②
//@AllArgsConstructor @NoArgsConstructor
//@Data  //getter/setter/equals/canEqual,hashCode,toString,기본생성자

//①
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @ToString
public class ProductDTO {
	private int productId;
	private String Pname;
	private int price;
	private String content;
}
