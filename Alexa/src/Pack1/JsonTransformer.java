package Pack1;

import com.google.gson.Gson;

import spark.ResponseTransformer;

public class JsonTransformer implements ResponseTransformer {

	private Gson gson = new Gson ();
	
	public String render(Object model) throws Exception {
		System.out.println("Rendering to JSON");
		return gson.toJson(model);
	}

}
