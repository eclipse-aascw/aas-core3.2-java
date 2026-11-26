// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.Objects;

/** Builder for the Resource type. */
public class ResourceBuilder {
  /**
   * Path and name of the resource (with file extension).
   *
   * <p>The path can be absolute or relative.
   */
  private String path;

  /**
   * Content type of the content of the file.
   *
   * <p>A single content type (MIME type) can have multiple file extensions associated with it.
   */
  private String contentType;

  public ResourceBuilder(String path) {
    this.path = Objects.requireNonNull(path, "Argument \"path\" must be non-null.");
  }

  public ResourceBuilder setContentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  public Resource build() {
    return new Resource(this.path, this.contentType);
  }
}
