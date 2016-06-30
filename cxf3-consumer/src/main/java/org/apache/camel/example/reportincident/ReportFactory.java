package org.apache.camel.example.reportincident;

import java.util.Random;

public class ReportFactory extends ObjectFactory {

    /**
     * Create an instance of {@link InputReportIncident }
     * 
     */
	@Override
    public InputReportIncident createInputReportIncident() {
		InputReportIncident incident = new InputReportIncident();
		
		incident.setIncidentId(Integer.toString(new Random().nextInt(10000)));
	    incident.setIncidentDate("2016-06-28");
	    incident.setGivenName("Firstname");
	    incident.setFamilyName("Lastname");
	    incident.setSummary("hum!");
	    incident.setDetails("hum! hum! hum!");
	    incident.setEmail("name@orga.com");
	    incident.setPhone("01234423434535");
	    
		return incident;
    }

}
