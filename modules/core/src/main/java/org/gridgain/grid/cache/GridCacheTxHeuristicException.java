/* 
 Copyright (C) GridGain Systems. All Rights Reserved.
 
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0
 
 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.cache;

import org.gridgain.grid.*;

/**
 * Exception thrown whenever grid transaction enters an unknown state.
 * This exception is usually thrown whenever commit partially succeeds.
 * Cache will still resolve this situation automatically to ensure data
 * integrity, by invalidating all values participating in this transaction
 * on remote nodes.
 */
public class GridCacheTxHeuristicException extends GridException {
    /** */
    private static final long serialVersionUID = 0L;

    /**
     * Creates new heuristic exception with given error message.
     *
     * @param msg Error message.
     */
    public GridCacheTxHeuristicException(String msg) {
        super(msg);
    }

    /**
     * Creates new heuristic exception with given error message and optional nested exception.
     *
     * @param msg Error message.
     * @param cause Optional nested exception (can be <tt>null</tt>).
     */
    public GridCacheTxHeuristicException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
