// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;

/** Builder for the BlobValue type. */
public class BlobValueBuilder {
  /** The content type of the BLOB, <em>e.g.</em>, {@code application/pdf}. */
  private String contentType;

  /** The BLOB content. */
  private byte[] value;

  public BlobValueBuilder setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public BlobValueBuilder setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public BlobValue build() {
    return new BlobValue(this.contentType, this.value);
  }
}
