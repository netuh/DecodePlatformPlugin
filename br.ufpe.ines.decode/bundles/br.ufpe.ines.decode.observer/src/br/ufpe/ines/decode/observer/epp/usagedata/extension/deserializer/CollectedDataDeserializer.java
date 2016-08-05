package br.ufpe.ines.decode.observer.epp.usagedata.extension.deserializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import br.ufpe.ines.decode.observer.epp.usagedata.extension.actions.ActionInterface;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.data.AtomicCollectedData;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.data.CollectedDataInterface;
import br.ufpe.ines.decode.observer.epp.usagedata.extension.data.CollectedDataWithTime;

@SuppressWarnings("rawtypes")
public class CollectedDataDeserializer implements JsonDeserializer<CollectedDataInterface> {

	private Class[] actionRealization = new Class[]{CollectedDataWithTime.class, AtomicCollectedData.class};

	@Override
	public CollectedDataInterface deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		GsonBuilder gsonBuilder = new GsonBuilder();
		gsonBuilder.registerTypeAdapter(ActionInterface.class, new ActionDeserializer());
		Gson gson = gsonBuilder.create();
		for (Class aClass : actionRealization) {
			@SuppressWarnings("unchecked")
			CollectedDataInterface action =  (CollectedDataInterface) gson.fromJson(json,
					aClass);
			if (action != null)
				return action;
		}
		
		return null;
	}

}
