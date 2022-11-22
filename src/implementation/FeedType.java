package implementation;

import messages.IMessage;

public interface FeedType {
	public void add(IMessage msg);
	public IMessage getLatest();
}
