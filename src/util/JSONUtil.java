package util;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class JSONUtil {

	private static Gson gson;
	static{
	    gson = new Gson();
	}
	
	public static String toJsonStr(Object obj) {
		
		return gson.toJson(obj);
	}
	
	public static <T> T fromJson(String jsonStr, Class<T> cls) {
		return gson.fromJson(jsonStr, cls);
	}
	
	public static <T> List<T> toList(String jsonListStr, Class<T> cls) {
		
	
		return gson.fromJson(jsonListStr, new TypeToken<List<T>>(){}.getType());
		
	}
}
