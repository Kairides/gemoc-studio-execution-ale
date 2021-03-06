package org.eclipse.gemoc.ale.language.mb.sample.deployer.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.gemoc.ale.language.sample.deployer.Activator;
import org.eclipse.gemoc.sequential.language.wb.sample.deployer.wizards.AbstractExampleWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class AleFsmExampleWizard extends AbstractExampleWizard {

	@Override
	protected AbstractUIPlugin getContainerPlugin() {
		return Activator.getDefault();
	}

	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>(1);
		// extract project in a compilation friendly way, give the compiler a chance to be more efficient and succeed without a "clean all"
		projects.add(new ProjectDescriptor(Activator.PLUGIN_ID, "zips/org.eclipse.gemoc.sample.ale.fsm.model_examples.zip", 	"org.eclipse.gemoc.sample.ale.fsm.model_examples"));
return projects;
	}

}
