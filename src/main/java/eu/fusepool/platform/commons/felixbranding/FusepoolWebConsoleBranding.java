package eu.fusepool.platform.commons.felixbranding;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.felix.webconsole.BrandingPlugin;

@Component
@Service(BrandingPlugin.class)
public class FusepoolWebConsoleBranding implements BrandingPlugin {

	public String getBrandName() {
		return "Fusepool Platform";
	}

	public String getFavIcon() {
		return "fusepool/res/fusepool-icon-only-16x16.png";
	}

	public String getMainStyleSheet() {
		return "/res/ui/webconsole.css";// "fusepool/res/style.css";
	}

	public String getProductImage() {
		return "fusepool/res/fusepool-icon-text-300x66.png";
	}

	public String getProductName() {
		return "Fusepool Platform";
	}

	public String getProductURL() {
		return "http://www.fusepool.eu/";
	}

	public String getVendorImage() {
		return "webconsolebranding/images/fusepool/fusepool-icon-text-300x66.png";
	}

	public String getVendorName() {
		return "Fusepool";
	}

	public String getVendorURL() {
		return "http://www.fusepool.eu/";
	}

}
