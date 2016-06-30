package org.apache.camel.example.reportincident;

public class Reporter implements Runnable {

	ReportIncidentEndpointService service;
	
	public void setReportService(ReportIncidentEndpointService service) {
	    this.service = service;
	}
	
	public void run() {
		
	}
}
