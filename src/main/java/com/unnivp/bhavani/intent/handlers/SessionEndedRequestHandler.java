package com.unnivp.bhavani.intent.handlers;

import static com.amazon.ask.request.Predicates.requestType;

import java.util.Optional;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;

/**
 * Class to handle the Exit intent for 'Bhavani' stream.
 * Invoked when Stream session ends.
 * @author unnivp
 *
 */
public class SessionEndedRequestHandler implements RequestHandler {

	public boolean canHandle(HandlerInput input) {
		return input.matches(requestType(SessionEndedRequest.class));
	}

	public Optional<Response> handle(HandlerInput input) {
		String speechText = "Bye Bye";
		return input.getResponseBuilder().withSpeech(speechText).withSimpleCard("Bhavani", speechText).build();
	}
}