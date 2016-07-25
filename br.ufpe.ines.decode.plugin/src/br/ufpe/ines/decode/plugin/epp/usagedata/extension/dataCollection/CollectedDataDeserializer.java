package br.ufpe.ines.decode.plugin.epp.usagedata.extension.dataCollection;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionDeserializer;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;

public class CollectedDataDeserializer implements JsonDeserializer<CollectedDataInterface> {

	@Override
	public CollectedDataInterface deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(ActionInterface.class, new ActionDeserializer());
		Gson gson = gsonBuilder.create();
		CollectedDataWithTime colected =  gson.fromJson(json,
					CollectedDataWithTime.class);
		if (colected != null)
			return colected;
		return gson.fromJson(json,
				AtomicCollectedData.class);
	}

}
