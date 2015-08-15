package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {

	@Value("Ben-Z")
	private String band="BMW";
	@Value("5000")
	private int price=300;

	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
