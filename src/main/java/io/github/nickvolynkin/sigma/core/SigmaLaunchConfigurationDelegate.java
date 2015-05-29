package io.github.nickvolynkin.sigma.core;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.model.LaunchConfigurationDelegate;

public class SigmaLaunchConfigurationDelegate extends LaunchConfigurationDelegate {
	
	public static final String PLUGIN_ID = "io.github.nickvolynkin.sigma.core";
	public static final String LAUNCH_CONFIGURATION_TYPE = PLUGIN_ID + ".SigmaLaunchConfigurationType";
	public static final String ATTRIBUTE_NAME_FOR_SIGMA_VERSION = PLUGIN_ID + ".SigmaVersion";
	public static final String ATTRIBUTE_NAME_FOR_CLC_LIST = PLUGIN_ID + ".SigmaLaunchConfigurationsMementoList";

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub
		
	}

}
