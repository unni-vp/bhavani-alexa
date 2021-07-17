package com.unnivp.bhavani.intent.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;

/**
 * Class to handle the Alexa Launch intent for 'Bhavani' stream.
 * Invoked when the stream in launched, by stating 'Ask Bhavani'.
 * @author unnivp
 *
 */
public class LaunchRequestHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(LaunchRequest.class));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Swaagatham";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Bhavani", speechText)
				.withReprompt(speechText).build();
	}
}