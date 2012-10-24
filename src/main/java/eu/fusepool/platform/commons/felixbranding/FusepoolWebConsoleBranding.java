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
		return "webconsolebranding/images/fusepool/fusepool-icon-only-16x16.png";
	}

	public String getMainStyleSheet() {
		return "css/style.css";
	}

	public String getProductImage() {
		return "webconsolebranding/images/fusepool/fusepool-icon-text-300x66.png";
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
