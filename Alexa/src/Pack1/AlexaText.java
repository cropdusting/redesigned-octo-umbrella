package Pack1;

public class AlexaText {

	
	/*
	 * {
  "uid": "urn:uuid:1335c695-cfb8-4ebb-abbd-80da344efa6b",
  "updateDate": "2016-05-23T00:00:00.0Z",
  "titleText": "Amazon Developer Blog, Week in Review May 23rd",
  "mainText": "Meet Echosim.io—a new online community tool for developers that simulates the look and feel of an Amazon Echo.",
  "redirectionUrl": "https://developer.amazon.com/public/community/blog"
}

	 */

	String uid;
	String updateDate;
	String titleText;
	String mainText;
	
	AlexaText (String uid, String updateDate, String titleText, String mainText) {
		this.uid = uid;
		this.updateDate = updateDate;
		this.titleText = titleText;
		this.mainText = mainText;
	}
	
}
