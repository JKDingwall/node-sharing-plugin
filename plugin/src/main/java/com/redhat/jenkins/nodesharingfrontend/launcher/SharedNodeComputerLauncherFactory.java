package com.redhat.jenkins.nodesharingfrontend.launcher;

import com.redhat.jenkins.nodesharingfrontend.HostInfo;
import hudson.slaves.ComputerLauncher;

import javax.annotation.Nonnull;

/**
 * Interface for Foreman Computer Launcher.
 *
 */
public abstract class SharedNodeComputerLauncherFactory {

    /**
     * Responsible for producing a Computer Launcher.
     *
     * @param host HostInfo of the computer.
     * @return a ComputerLauncher.
     * @throws Exception if occurs.
     */
    public abstract ComputerLauncher getComputerLauncher(@Nonnull HostInfo host) throws Exception;

}
