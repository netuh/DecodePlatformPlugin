package br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class ActionDeserializer implements JsonDeserializer<ActionInterface> {

	@Override
	public ActionInterface deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		Gson gson = new GsonBuilder().create();
		ActionBundle colected =  gson.fromJson(json,
				ActionBundle.class);
		if (colected != null)
			return colected;
		
		ActionCommand colected2 =  gson.fromJson(json,
				ActionCommand.class);
		if (colected2 != null)
			return colected2;
		
		
		ActionLog colected3 =  gson.fromJson(json,
				ActionLog.class);
		if (colected3 != null)
			return colected3;
		
		
		ActionPart colected4 =  gson.fromJson(json,
				ActionPart.class);
		if (colected4 != null)
			return colected4;

		ActionSystemInfo colected5 =  gson.fromJson(json,
				ActionSystemInfo.class);
		if (colected5 != null)
			return colected5;
		
		return null;
	}

}
