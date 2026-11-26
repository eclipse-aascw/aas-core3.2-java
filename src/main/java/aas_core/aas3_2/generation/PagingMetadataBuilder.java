// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;

/** Builder for the PagingMetadata type. */
public class PagingMetadataBuilder {
  /**
   * The cursor for the next part of the result set. No cursor attribute means that the end of the
   * result set has been reached.
   */
  private String cursor;

  public PagingMetadataBuilder setCursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

  public PagingMetadata build() {
    return new PagingMetadata(this.cursor);
  }
}
