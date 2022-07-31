package coaches;

import services.FortuneServices;


public class FootBallCoach implements Coach{
	
	private FortuneServices randomFortune;
	
	

	public FootBallCoach(FortuneServices randomFortune) {
		System.out.println("Constructor injection be�ll�tva a Football coachnak - RandomFortune");
		this.randomFortune = randomFortune;
	}

	@Override
	public String getDailyWorkout() {
		return "Most m�r fociedz� vagyok!";
	}

	@Override
	public String getDailyFortune() {
		return randomFortune.getFortune();
	}
	
	

}
