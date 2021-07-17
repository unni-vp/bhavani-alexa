package com.main;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.unnivp.bhavani.intent.handlers.BhavaniIntentHandler;
import com.unnivp.bhavani.intent.handlers.CancelandStopIntentHandler;
import com.unnivp.bhavani.intent.handlers.HelpIntentHandler;
import com.unnivp.bhavani.intent.handlers.LaunchRequestHandler;
import com.unnivp.bhavani.intent.handlers.SessionEndedRequestHandler;

/**
 * Class to handle the Alexa 'Bhavani' skill.
 * @author unnivp
 *
 */
public class BVRequestStreamHandler extends SkillStreamHandler {

	private static Skill getSkill() {
		return Skills.standard()
				.addRequestHandlers(new CancelandStopIntentHandler(), new BhavaniIntentHandler(),
						new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler())
				.build();
	}

	public BVRequestStreamHandler() {
		super(getSkill());
	}
}