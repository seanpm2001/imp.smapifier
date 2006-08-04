package com.ibm.watson.smapifier.builder;

import java.util.HashMap;
import java.util.Map;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.uide.core.ProjectNatureBase;
import org.eclipse.uide.runtime.IPluginLog;
import com.ibm.watson.smapifier.SmapiePlugin;

public class SmapiProjectNature extends ProjectNatureBase {
	public static final String k_natureID= SmapiePlugin.kPluginID + ".smapinature";
	private final String fExtension;

	public SmapiProjectNature(String exten) {
	    fExtension= exten;
	}

	public String getNatureID() {
		return k_natureID;
	}

	public String getBuilderID() {
		return SmapieBuilder.BUILDER_ID;
	}

	public IPluginLog getLog() {
		return SmapiePlugin.getDefault();
	}

	protected void refreshPrefs() {
	}

	protected String getUpstreamBuilderID() {
		return "org.eclipse.jdt.core.javabuilder";
	}

	protected Map getBuilderArguments() {
	    Map m= new HashMap();

	    m.put("exten", fExtension);
	    return m;
	}
}
