package coaches;

import services.FortuneServices;

public class CricketCoach implements Coach{
	
	private FortuneServices fortuneService;
	private String email;
	private String team;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Hi im a cricket Coach. Lets do the daily workout.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	//setter injection
	public void setFortuneService(FortuneServices fortuneService) {
		System.out.println("Setter injection beállítva a Cricket Coachnak");
		this.fortuneService = fortuneService;
	}

	//Setter injecting literal values
	public void setEmail(String email) {
		System.out.println("Setter injection beállítva az emailnek");
		this.email = email;
	}

	public void setTeam(String team) {
		System.out.println("Setter injection beállítva a teamnek");
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
	
	


	
	
	
	
	
	
	
	

}
