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

/** Builder for the GetConceptDescriptionsResult type. */
public class GetConceptDescriptionsResultBuilder {
  /**
   * Additional information for the client to, <em>e.g.</em>, fetch the next part of the result set.
   */
  private IPagingMetadata pagingMetadata;

  /** The returned items. */
  private List<IConceptDescription> result;

  public GetConceptDescriptionsResultBuilder(IPagingMetadata pagingMetadata) {
    this.pagingMetadata =
        Objects.requireNonNull(pagingMetadata, "Argument \"pagingMetadata\" must be non-null.");
  }

  public GetConceptDescriptionsResultBuilder setResult(List<IConceptDescription> result) {
    this.result = result;
    return this;
  }

  public GetConceptDescriptionsResult build() {
    return new GetConceptDescriptionsResult(this.pagingMetadata, this.result);
  }
}
