package in.kanha.entiry;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cource {

	@Id
	private Integer courceID;
	private String courceName;
	private Double courcePrice;
	public Integer getcourceID() {
		return courceID;
	}
	public void setcourceID(Integer courceID) {
		courceID = courceID;
	}
	public String getcourceName() {
		return courceName;
	}
	public void setcourceName(String courceName) {
		courceName = courceName;
	}
	public Double getcourcePrice() {
		return courcePrice;
	}
	public void setcourcePrice(Double courcePrice) {
		courcePrice = courcePrice;
	}
	@Override
	public String toString() {
		return "cource [courceID=" + courceID + ", courceName=" + courceName + ", courcePrice=" + courcePrice + "]";
	}
}
