Camel Router Project for Apache CXF contract-first using Blueprint (OSGi)
=========================================================================

To build this project use

    mvn install

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You need to install the following features first:

    features:install camel-jaxb
    features:install camel-cxf
    features:install cxf-transports-jms
    
And then you can install this example from its shell:

    osgi:install -s mvn:org.sandpit.fuse/soap-jms-client/1.0.0-SNAPSHOT

For help see the Apache Camel documentation

    http://camel.apache.org/
