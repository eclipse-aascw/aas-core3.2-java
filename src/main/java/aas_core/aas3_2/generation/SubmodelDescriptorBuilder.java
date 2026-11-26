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

/** Builder for the SubmodelDescriptor type. */
public class SubmodelDescriptorBuilder {
  /**
   * Description or comments on the element.
   *
   * <p>The description can be provided in several languages.
   */
  private List<ILangStringTextType> description;

  /** Display name. Can be provided in several languages. */
  private List<ILangStringNameType> displayName;

  /**
   * An extension of the element.
   *
   * <p>Extensions are proprietary, i.e. they do not support global interoperability.
   */
  private List<IExtension> extensions;

  /** Endpoint of the network resource. */
  private List<IEndpoint> endpoints;

  /** Globally unique identification of the Submodel. */
  private String id;

  /** Administrative information of the Submodel. */
  private IAdministrativeInformation administration;

  /** Short name of the Submodel. */
  private String idShort;

  /** Identifier of the semantic definition of the Submodel. */
  private IReference semanticId;

  /**
   * Identifier of a supplemental semantic definition of the element called supplemental semantic ID
   * of the element.
   */
  private List<IReference> supplementalSemanticIds;

  public SubmodelDescriptorBuilder(List<IEndpoint> endpoints, String id) {
    this.endpoints = Objects.requireNonNull(endpoints, "Argument \"endpoints\" must be non-null.");
    this.id = Objects.requireNonNull(id, "Argument \"id\" must be non-null.");
  }

  public SubmodelDescriptorBuilder setDescription(List<ILangStringTextType> description) {
    this.description = description;
    return this;
  }

  public SubmodelDescriptorBuilder setDisplayName(List<ILangStringNameType> displayName) {
    this.displayName = displayName;
    return this;
  }

  public SubmodelDescriptorBuilder setExtensions(List<IExtension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public SubmodelDescriptorBuilder setAdministration(IAdministrativeInformation administration) {
    this.administration = administration;
    return this;
  }

  public SubmodelDescriptorBuilder setIdShort(String idShort) {
    this.idShort = idShort;
    return this;
  }

  public SubmodelDescriptorBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public SubmodelDescriptorBuilder setSupplementalSemanticIds(
      List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public SubmodelDescriptor build() {
    return new SubmodelDescriptor(
        this.endpoints,
        this.id,
        this.description,
        this.displayName,
        this.extensions,
        this.administration,
        this.idShort,
        this.semanticId,
        this.supplementalSemanticIds);
  }
}
