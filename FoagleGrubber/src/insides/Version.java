package insides;

public class Version {

	String version;
	
	public Version() {
		Package P = getClass().getPackage();
		version = P.getImplementationVersion();
	}
	
	public String getVersion() {
		return version;
	}
}
