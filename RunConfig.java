package configTest;

public class RunConfig {

	public static void main(String[] args) throws Exception {
		//Read Config File and Get Excel File Name
		ConfigClass config = new ConfigClass();
		String retrec=config.GetInputInfo("C:\\classinterview\\config.properties");
		System.out.println("Retrec=" + retrec);
		
	
	}

}
