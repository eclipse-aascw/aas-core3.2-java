// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.List;
import java.util.Objects;

/** Builder for the GetSubmodelsMetadataResult type. */
public class GetSubmodelsMetadataResultBuilder {
  /**
   * Additional information for the client to, <em>e.g.</em>, fetch the next part of the result set.
   */
  private IPagingMetadata pagingMetadata;

  /** The returned items. */
  private List<ISubmodelMetadata> result;

  public GetSubmodelsMetadataResultBuilder(IPagingMetadata pagingMetadata) {
    this.pagingMetadata =
        Objects.requireNonNull(pagingMetadata, "Argument \"pagingMetadata\" must be non-null.");
  }

  public GetSubmodelsMetadataResultBuilder setResult(List<ISubmodelMetadata> result) {
    this.result = result;
    return this;
  }

  public GetSubmodelsMetadataResult build() {
    return new GetSubmodelsMetadataResult(this.pagingMetadata, this.result);
  }
}
