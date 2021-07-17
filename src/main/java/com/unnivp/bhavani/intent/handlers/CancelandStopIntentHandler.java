package com.unnivp.bhavani.intent.handlers;

import java.util.Optional;
import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import static com.amazon.ask.request.Predicates.intentName;
import com.amazon.ask.model.Response;

/**
 * Class to handle the Alexa Stop/Cancel intent for 'Bhavani' stream.
 * Invoked when 'Stop'/'Cancel' term is stated.
 * @author unnivp
 *
 */
public class CancelandStopIntentHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Bye Bye";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Bhavani", speechText).build();
	}
}