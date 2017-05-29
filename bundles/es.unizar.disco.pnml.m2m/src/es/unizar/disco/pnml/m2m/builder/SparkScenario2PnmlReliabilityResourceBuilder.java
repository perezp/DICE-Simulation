package es.unizar.disco.pnml.m2m.builder;

import org.eclipse.emf.common.util.URI;

import es.unizar.disco.pnml.m2m.PnmlM2mPlugin;

public class SparkScenario2PnmlReliabilityResourceBuilder extends AbstractPnmlResourceBuilder {

	@Override
	protected URI getTransformationUri() {
		return URI.createURI(PnmlM2mPlugin.DTSM_SPARK_AD2PNML_RELIABILITY_TRANSFORMATION_URI);
	}

}
