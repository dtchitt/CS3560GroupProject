package abstraction;

import implementation.FeedType;


/**
 * Can optionally extend Feed to make "advanced Feeds"
 * This is a feature of the bridge pattern which can be used and is OPTIONAL
 */
public class AutoRefreshFeed extends Feed {

	public AutoRefreshFeed(FeedType feedType) {
		super(feedType);
		//TODO Auto-generated constructor stub
	}
	
}
