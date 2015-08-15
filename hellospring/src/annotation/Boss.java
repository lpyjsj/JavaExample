package annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("boss")
public class Boss {
	@Autowired
	@Qualifier("car")
	private Car car;

	
	public void display()
	{
		System.out.println("boss's  car info : "+car.getBand()+" "+car.getPrice());
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}


}
