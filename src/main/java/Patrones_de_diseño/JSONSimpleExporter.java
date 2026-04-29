package Patrones_de_diseño;

import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
public class JSONSimpleExporter implements Exporter {

	private JSONObject exportar(Socio socio) {
		
		
		JSONObject socioJSON = new JSONObject();
		
		socioJSON.put("nombre", socio.getNombre());
		socioJSON.put("email", socio.getEmail());
		socioJSON.put("legajo", socio.getLegajo());
		
		return socioJSON;
	}

	@Override
	public String exportar(List<Socio> socios) {
		if (socios.isEmpty()) {
			return "[]";
		}
		JSONArray sociosJSON = new JSONArray();
		
		socios.forEach(socio -> {
			sociosJSON.add(this.exportar(socio));
		});

		return sociosJSON.toJSONString();
	}

}
