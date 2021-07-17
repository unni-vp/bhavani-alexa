package com.unnivp.bhavani.intent.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Utility class to hold all responses for various intents for Bhavani.
 * 
 * @author unnivp
 *
 */
public class IntentResponseUtil {

	private Map<String, String> intentResponseMap;

	public IntentResponseUtil() {

		intentResponseMap = new HashMap<String, String>();

		intentResponseMap.put("BhavaniQOneIntent",
				"Sujith E S is the secretary, proprietor and all-in-all of Netaji Vayanasala situated in Konikkara panchayath. "
				+ "He also works at Cognizant during his leisure time.");
		intentResponseMap.put("BhavaniQTwoIntent",
				"Sumesh Kumar or Chillax kumar, is the Manager Development at Cognizant. "
				+ "He also provides expert advice to his followers like Modi, Baaba Raamdev and Amit Shaji.");
		intentResponseMap.put("BhavaniQThrIntent",
				"Vimal Raj, popularly known as the 'Solo traveller' is a body builder and travel freak. "
				+ "He also owns a number of patents in visualisation and scanning.");
		intentResponseMap.put("BhavaniQForIntent",
				"Jiby George alias Aashaan is one of the oldest chronic bachelors in kerala. "
				+ "He is the winner of the ever-rolling Chali Raajaav trophy and also has a doctorate in Puttu making.");
		intentResponseMap.put("BhavaniQFivIntent",
				"Navya Divakara Menon belongs to the royal family of thirupunithara. "
				+ "A highly punctual person to the core, she ensures the team have lunch and tea at the right time.");
		intentResponseMap.put("BhavaniQSixIntent",
				"Afeesa, also known as 'Shall O Khan', is a local feminist. A devoted advocate of recycling, "
				+ "she promotes reuse by returning once used apparels back to the online retailers.");
		intentResponseMap.put("BhavaniQSevIntent",
				"Jithin Joji is a famous assistant director, fondly known for the 'Bunty Chor' movie. "
				+ "He is also renowned for making accurate predictions, similar to famous astrologer Kanipayyur.");
		intentResponseMap.put("BhavaniQEgtIntent",
				"Nithin Krishnan or Aaashan's shishyan is a celebrated flute artist. To maintain peace and harmony in the world, "
				+ "he practices his art in the hidden corridors of Cognizant.");
		intentResponseMap.put("BhavaniQNinIntent",
				"Gireesh is a very energetic, fantastic and extraordinary manager. Seriously!! I am telling the truth!! "
				+ "Don't ever think it's because of he being my supervisor!!");
		intentResponseMap.put("BhavaniQTenIntent",
				"Sonthosh, Egg Man of C P, is an upcoming tamil mimicry artist. When he is not eating omelettes, "
				+ "he promotes AI ringtone among the C P colleagues.");

	}
	
	public Map<String, String> getIntentResponseMap() {
		return intentResponseMap;
	}
	
	public static Map<String, String> getMap() {
		
		return (new IntentResponseUtil()).getIntentResponseMap();
	}

}
