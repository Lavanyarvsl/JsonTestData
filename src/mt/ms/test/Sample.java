package mt.ms.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Sample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 JSONObject jo = new JSONObject(); 
		 
		 Map<String, String> ordMap = new LinkedHashMap<String, String>(31);
		 ordMap.put("bussUnit", "ESND");
		 ordMap.put("srcOrdNo", "ORDESND");
		 ordMap.put("custOrdNo", "CUSTESND10152019123459");
		 ordMap.put("spltOrdNo", "9876543222");
		 ordMap.put("ordNo", "ESND");
		 ordMap.put("tranDt", "2019-09-21T16:16:10");
		 ordMap.put("ordDt", "2019-09-21T16:16:10");
		 ordMap.put("ordTot", "999.99");
		 ordMap.put("node", "085");
		 ordMap.put("splsNode", "972");
		 ordMap.put("scac", "ABCDEF");
		 ordMap.put("scacCode", "GROUND");
		 ordMap.put("hub", "3909");
		 ordMap.put("zone", "UP");
		 ordMap.put("logoId", "11111111");
		 ordMap.put("shpLblId", "11111111");
		 ordMap.put("snglLblReq", "N");
		 ordMap.put("pckLstReq", "Y");
		 ordMap.put("reqShpDt", "2019-10-21T16:16:10");
		 ordMap.put("dlrRteTag", "11111");
		 ordMap.put("dlrRte", "DLRRTE2345");
		 ordMap.put("dlrRefTag", "11111");
		 ordMap.put("dlrRef", "DLRREF12345");
		 ordMap.put("dlrShrtRte", "DS001");
		 ordMap.put("dlrMemoPO", "11vtl");
		 ordMap.put("endConPOTag", "epo");
		 ordMap.put("endConPONum", "POBrderBridge");
		 ordMap.put("barCd1", "NJ001");
		 ordMap.put("barCd2", "1001");
		 ordMap.put("barCd3", "DSROUTE");
		 ordMap.put("barCd4", "Department001");
		 
		 jo.put("ord", ordMap);
		 
		 System.out.println("My Json::::"+jo);
		 
		 
		/* LinkedHashMap<String,String> list = new LinkedHashMap<String,String>();
		 
		 list.put("AA", "11");
		 list.put("BB", "22");
		 list.put("CC", "44");
		 
		 JSONArray array = new JSONArray();
	      for(int i = 0; i < list.size(); i++) {
	         array.put(list.get(i));
	      }*/
		 
		 
	}

}
