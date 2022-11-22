package abstraction;

import implementation.FeedType;
import messages.IMessage;

/**
 * Abstraction hierarchy. Major component of the Bridge Pattern.
 */
public class Feed {
	protected FeedType feedType;

	public Feed(FeedType feedType) {
		this.feedType = feedType;
	}

	public void addMessage(IMessage msg) {
		//TODO
	}

	public void displayMessage(IMessage msg) {
		//TODO
	}
}
