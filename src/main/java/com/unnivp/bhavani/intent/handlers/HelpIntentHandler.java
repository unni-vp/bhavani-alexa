package com.unnivp.bhavani.intent.handlers;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.model.Response;

/**
 * Class to handle the Alexa Help intent for 'Bhavani' stream.
 * Invoked when 'Help' term is stated.
 * @author unnivp
 *
 */
public class HelpIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.HelpIntent"));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Ask Bhavaani for interesting facts about C P Chaaya Team.";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Bhavani", speechText)
				.withReprompt(speechText).build();
	}
}