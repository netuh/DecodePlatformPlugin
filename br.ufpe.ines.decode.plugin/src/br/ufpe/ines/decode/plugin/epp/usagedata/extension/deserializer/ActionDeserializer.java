package br.ufpe.ines.decode.plugin.epp.usagedata.extension.deserializer;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionBundle;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionCommand;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionInterface;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionLog;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionPart;
import br.ufpe.ines.decode.plugin.epp.usagedata.extension.actions.ActionSystemInfo;

@SuppressWarnings("rawtypes")
public class ActionDeserializer implements JsonDeserializer<ActionInterface> {

	private Class[] actionRealization = new Class[]{ActionBundle.class, ActionCommand.class,
			ActionLog.class, ActionPart.class, ActionSystemInfo.class}; 

	@Override
	public ActionInterface deserialize(JsonElement json, Type type, JsonDeserializationContext context)
			throws JsonParseException {
		Gson gson = new GsonBuilder().create();
		for (Class aClass : actionRealization) {
			@SuppressWarnings("unchecked")
			ActionInterface action =  (ActionInterface) gson.fromJson(json,
					aClass);
			if (action != null)
				return action;
		}
		
		return null;
	}
}
