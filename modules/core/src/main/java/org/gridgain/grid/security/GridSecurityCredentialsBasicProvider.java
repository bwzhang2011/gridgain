/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.security;

import org.gridgain.grid.*;

/**
 * TODO: Add class description.
 */
public class GridSecurityCredentialsBasicProvider implements GridSecurityCredentialsProvider {
    /** */
    private GridSecurityCredentials cred;

    /**
     * @param cred Security credentials.
     */
    public GridSecurityCredentialsBasicProvider(GridSecurityCredentials cred) {
        this.cred = cred;
    }

    /** {@inheritDoc} */
    @Override public GridSecurityCredentials credentials() throws GridException {
        return cred;
    }
}