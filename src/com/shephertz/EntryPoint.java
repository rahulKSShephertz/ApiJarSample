package com.shephertz;

import java.util.HashMap;

import com.shephertz.app42.paas.customcode.Executor;
import com.shephertz.app42.paas.customcode.HttpRequestObject;
import com.shephertz.app42.paas.customcode.HttpResponseObject;

public class EntryPoint implements Executor  {

	
	@Override
	public HttpResponseObject execute(HttpRequestObject arg0) {
		/*Some logic here.*/
		return new HttpResponseObject(200, "API sample jar is running successfully.", new HashMap<String, String>());
	}
	

}
