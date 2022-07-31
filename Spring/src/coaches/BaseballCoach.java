package coaches;

import services.FortuneServices;

public class BaseballCoach implements Coach{
	
	private FortuneServices fortuneService;
	
	
	//contructor injection
    public BaseballCoach(FortuneServices fortuneService) {
    	System.out.println("Constructor injection beállítva a Baseball coachnak");
		this.fortuneService = fortuneService;
	}



	@Override
    public String getDailyWorkout() {
        return "Spend 30 minutes stb";
    }



	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
