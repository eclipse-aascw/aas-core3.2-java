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

/** Builder for the SpecificAssetId type. */
public class SpecificAssetIdBuilder {
  /**
   * Identifier of the semantic definition of the element. It is called semantic ID of the element
   * or also main semantic ID of the element.
   */
  private IReference semanticId;

  /**
   * Identifier of a supplemental semantic definition of the element. It is called supplemental
   * semantic ID of the element.
   */
  private List<IReference> supplementalSemanticIds;

  /** Name of the asset identifier. */
  private String name;

  /** The value of the specific asset identifier with the corresponding name. */
  private String value;

  /**
   * The unique ID of the (external) subject the specific asset ID value belongs to or has meaning
   * to.
   *
   * <p>This is an external reference.
   */
  private IReference externalSubjectId;

  public SpecificAssetIdBuilder(String name, String value) {
    this.name = Objects.requireNonNull(name, "Argument \"name\" must be non-null.");
    this.value = Objects.requireNonNull(value, "Argument \"value\" must be non-null.");
  }

  public SpecificAssetIdBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public SpecificAssetIdBuilder setSupplementalSemanticIds(
      List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public SpecificAssetIdBuilder setExternalSubjectId(IReference externalSubjectId) {
    this.externalSubjectId = externalSubjectId;
    return this;
  }

  public SpecificAssetId build() {
    return new SpecificAssetId(
        this.name,
        this.value,
        this.semanticId,
        this.supplementalSemanticIds,
        this.externalSubjectId);
  }
}
