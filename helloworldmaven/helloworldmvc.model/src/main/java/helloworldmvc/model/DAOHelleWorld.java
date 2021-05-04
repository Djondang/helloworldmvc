package helloworldmvc.model;

public class DAOHelleWorld<DAOHelloWorld> {
	private String FileName = "Helloworld.txt";
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	
	public String getHelloWorldMessage() {
		return helloWorldMessage;
	}
	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}
	public DAOHelloWorld getInstance() {
		return instance;
	}
	private void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}
	private DAOHelleWorld() {
		
	}
	private void readFile() {
		/*System.out.println("Hello World");*/
	}
	public String getFileName() {
		return FileName;
	}
	public void setFileName(String fileName) {
		FileName = fileName;
	}
	
	
	
	

}
