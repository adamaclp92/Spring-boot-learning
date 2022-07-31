package coaches;

import org.springframework.beans.factory.DisposableBean;

import services.FortuneServices;

public class TrackCoach implements Coach, DisposableBean{

	private FortuneServices fortuneService;
	
	@Override
	public String getDailyWorkout() {
	
		return "TrackCoach";
	}
	


	public TrackCoach(FortuneServices fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it " + fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("Indítócucc");
	}
	
	//add a destroy method
	public void doMyEndupStuff() {
		
	}



	@Override
	public void destroy() throws Exception {
		System.out.println("Zárócucc");
		
	}
	
	

	
}
