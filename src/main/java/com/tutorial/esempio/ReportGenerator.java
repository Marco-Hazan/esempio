package com.tutorial.esempio;

public class ReportGenerator {

	private Report report;
	
	public ReportGenerator() {}
	
	public void reportGen(String data) {
		report.generate(data);
		System.out.println("----------------");
		report.saveToFile();
	}
	
	public void setReport(Report r) {
		report = r;
	}
}
