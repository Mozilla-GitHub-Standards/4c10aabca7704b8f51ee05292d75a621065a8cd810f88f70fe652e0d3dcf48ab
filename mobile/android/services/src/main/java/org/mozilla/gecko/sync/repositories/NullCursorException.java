/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */

package org.mozilla.gecko.sync.repositories;

import org.mozilla.gecko.sync.SyncException;

public class NullCursorException extends SyncException {

  private static final long serialVersionUID = 3146506225701104661L;

  public NullCursorException(Exception e) {
    super(e);
  }

}
