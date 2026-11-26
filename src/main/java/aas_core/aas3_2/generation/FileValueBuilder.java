// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;

/** Builder for the FileValue type. */
public class FileValueBuilder {
  /** The content type of the file, <em>e.g.</em>, {@code application/pdf}. */
  private String contentType;

  /** The path or URL to the file content. */
  private String value;

  public FileValueBuilder setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public FileValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public FileValue build() {
    return new FileValue(this.contentType, this.value);
  }
}
