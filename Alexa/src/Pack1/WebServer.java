package Pack1;
import static spark.Spark.*;

import spark.Request;
import spark.Response;
import spark.Route;


public class WebServer {

	public static void main (String[] args){
		port(80);
		
		//get ("/test", (req,res) -> "Test ...");
	
		get("/headers", new Route() {
			@Override
			public Object handle(Request req, Response res) throws Exception {
				
				System.out.println(req.headers());
				return "Headers";
				
			}
		},new JsonTransformer());
	
		
		get ("/alexa", new Route() {
			@Override
			public Object handle(Request req, Response res) throws Exception {
				
				res.type("application/json");
				
				return new AlexaText("067e6162-3b6f-4ae2-a171-2470b63dff00", "2016-11-26T22:51:00.0Z", "FeedTitle", "This is a test");
				
			}
		}, new JsonTransformer());
		
	}
	
}
