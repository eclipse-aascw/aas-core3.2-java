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

/** Builder for the SubmodelRecentChange type. */
public class SubmodelRecentChangeBuilder {
  /** The point in time at which the Identifiable object was created */
  private String createdAt;

  /** The point in time at which the Identifiable object was recently updated */
  private String updatedAt;

  /** Globally unique identification of the Submodel */
  private String id;

  /** Identifier of the semantic definition of the Submodel */
  private IReference semanticId;

  /**
   * Identifier of a supplemental semantic definition of the element called supplemental semantic ID
   * of the element
   */
  private List<IReference> supplementalSemanticIds;

  public SubmodelRecentChangeBuilder(String createdAt, String updatedAt, String id) {
    this.createdAt = Objects.requireNonNull(createdAt, "Argument \"createdAt\" must be non-null.");
    this.updatedAt = Objects.requireNonNull(updatedAt, "Argument \"updatedAt\" must be non-null.");
    this.id = Objects.requireNonNull(id, "Argument \"id\" must be non-null.");
  }

  public SubmodelRecentChangeBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public SubmodelRecentChangeBuilder setSupplementalSemanticIds(
      List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public SubmodelRecentChange build() {
    return new SubmodelRecentChange(
        this.createdAt, this.updatedAt, this.id, this.semanticId, this.supplementalSemanticIds);
  }
}
