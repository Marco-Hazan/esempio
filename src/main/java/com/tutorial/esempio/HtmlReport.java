package com.tutorial.esempio;

public class HtmlReport implements Report{
	
	private String path;

	@Override
	public void generate(String data) {
		System.out.println("Genero html report");
		
	}

	@Override
	public void saveToFile() {
		System.out.println("html generato");
		System.out.println("<p>Prova</p>");
		
	}

}
