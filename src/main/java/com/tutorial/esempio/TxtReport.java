package com.tutorial.esempio;

public class TxtReport implements Report{

	private String path;
	
	
	public TxtReport(String path) {
		this.path = path;
	}

	@Override
	public void generate(String data) {
		System.out.println("Genera txt report");
		System.out.println(data);
	}

	@Override
	public void saveToFile() {
		System.out.println("provo a salvare il file nel seguente path: " + path);
		System.out.println("file salvato");
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
