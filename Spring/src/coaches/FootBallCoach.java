package coaches;

import services.FortuneServices;


public class FootBallCoach implements Coach{
	
	private FortuneServices randomFortune;
	
	

	public FootBallCoach(FortuneServices randomFortune) {
		System.out.println("Constructor injection beállítva a Football coachnak - RandomFortune");
		this.randomFortune = randomFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Most már fociedzõ vagyok!";
	}

	@Override
	public String getDailyFortune() {
		return randomFortune.getFortune();
	}
	
	

}
