package com.unnivp.bhavani.intent.handlers;

import static com.amazon.ask.request.Predicates.intentName;
import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.unnivp.bhavani.intent.util.IntentResponseUtil;

/**
 * Class to handle the Alexa intent request for 'Bhavani' stream.
 * Skill can be triggered by saying 'Alexa, Ask Bhavani <Intent>'.
 * @author unnivp
 *
 */
public class BhavaniIntentHandler implements RequestHandler {
	
	private final String DEFAULT_RESPONSE = "I am the answer!! Kilometers and kilometers from Miami beach to Washington DC.";

	/**
	 * Check if the Alexa intent request is understood and can be handled.
	 * @input handler input
	 */
	public boolean canHandle(HandlerInput input) {
		
		return !input.matches(requestType(LaunchRequest.class));
	}

	/**
	 * Respond to Alexa intent requests with configured speech response.
	 * @input handler input
	 */
	public Optional<Response> handle(HandlerInput input) {

		// Default speech response.
		AtomicReference<String> speechText = new AtomicReference<>();
		speechText.set(DEFAULT_RESPONSE);

		IntentResponseUtil.intentResponseMap.forEach((intent, response) -> {
			
			// Return the response text for the matching intent from the speech response map. 
			if (input.matches(intentName(intent))) {
				speechText.set(response);
			}
		});
		
		// Build the Alexa speech response.
		return input.getResponseBuilder().withSpeech(speechText.get()).withSimpleCard("Bhavani", speechText.get()).build();
	}

}