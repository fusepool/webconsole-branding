package eu.fusepool.platform.commons.felixbranding;

import java.io.IOException;
import java.net.URL;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.osgi.framework.BundleContext;

@Component
@Service(Servlet.class)
@Properties({
		@Property(name = "felix.webconsole.label", value = "fusepool"),
		@Property(name = "felix.webconsole.title", value = "Fusepool Settings") })
public class WebConsolePlugin extends
		org.apache.felix.webconsole.AbstractWebConsolePlugin {

	private static final String STATIC_PREFIX = "/fusepool/res/";

	
	public static final String NAME = "Fusepool Settings";
	public static final String LABEL = "fusepool";

	public String getLabel() {
		return LABEL;
	}

	public String getTitle() {
		return NAME;
	}

	protected void renderContent(HttpServletRequest req,
			HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().write("Fusepool settings");
      
	}
	
	protected String[] getCssReferences() {
        String[] result = new String[0];
		return result;
    }

	public void activateBundle(BundleContext bundleContext) {
		super.activate(bundleContext);
	}

	public void deactivate() {
		super.deactivate();

	}
	
	public URL getResource(String path){
		if(path.startsWith(STATIC_PREFIX)){
			return this.getClass().getResource("res/"+path.substring(STATIC_PREFIX.length()));		
		}else {
			return null;
		}
	}
}