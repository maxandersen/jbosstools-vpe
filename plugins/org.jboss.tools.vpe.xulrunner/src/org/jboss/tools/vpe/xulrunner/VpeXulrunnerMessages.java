/*******************************************************************************
 * Copyright (c) 2007 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.vpe.xulrunner;

import org.eclipse.osgi.util.NLS;

public class VpeXulrunnerMessages extends NLS {
	private static final String BUNDLE_NAME = "org.jboss.tools.vpe.xulrunner.messages"; //$NON-NLS-1$
	public static String XulRunnerBrowser_bundleDoesNotContainXulrunner;
	public static String XulRunnerBrowser_bundleNotFound;
	public static String XulRunnerBrowser_cannotGetPathToXulrunner;
	public static String XulRunnerBrowser_notAvailable;
	public static String XulRunnerBrowser_wrongVersion;
	public static String XulRunnerBrowser_embeddedXulRunnerIsDisabledByOption;
	public static String CURRENT_PLATFORM_IS_NOT_SUPPORTED;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, VpeXulrunnerMessages.class);
	}

	private VpeXulrunnerMessages() {
	}
}
