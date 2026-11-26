// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.List;

/** Builder for the MultiLanguagePropertyMetadata type. */
public class MultiLanguagePropertyMetadataBuilder {
  /** An extension of the element. */
  private List<IExtension> extensions;

  /**
   * The category is a value that gives further meta information w.r.t. the class of the element. It
   * affects the expected existence of attributes and the applicability of constraints.
   *
   * <p>The category is not identical to the semantic definition ({@link
   * aas_core.aas3_2.types.model.IHasSemantics}) of an element. The category could e.g. denote that
   * the element is a measurement value, whereas the semantic definition of the element would denote
   * that it is the measured temperature.
   *
   * <p>Deprecated.
   */
  private String category;

  /**
   * In case of identifiables, this attribute is a short name of the element. In case of a
   * referable, this ID is an identifying string of the element within its name space.
   *
   * <p>In case the element is a property and the property has a semantic definition ({@link
   * aas_core.aas3_2.types.model.IHasSemantics#getSemanticId()}) conformant to IEC61360 the {@link
   * aas_core.aas3_2.types.model.IReferable#getIdShort()} is typically identical to the short name
   * in English, if available.
   */
  private String idShort;

  /** Display name. Can be provided in several languages. */
  private List<ILangStringNameType> displayName;

  /**
   * Description or comments on the element.
   *
   * <p>The description can be provided in several languages.
   *
   * <p>If no description is defined, the definition of the concept description that defines the
   * semantics of the element is used.
   *
   * <p>Additional information can be provided, e.g., if the element is qualified and which
   * qualifier types can be expected in which context or which additional data specification
   * templates.
   */
  private List<ILangStringTextType> description;

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

  /**
   * Additional qualification of a qualifiable element.
   *
   * <p>Constraints:
   *
   * <ul>
   *   <li>Constraint AASd-021: Every qualifiable shall only have one qualifier with the same {@link
   *       aas_core.aas3_2.types.impl.Qualifier#getType()}.
   * </ul>
   */
  private List<IQualifier> qualifiers;

  /** Embedded data specification. */
  private List<IEmbeddedDataSpecification> embeddedDataSpecifications;

  public MultiLanguagePropertyMetadataBuilder setExtensions(List<IExtension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setCategory(String category) {
    this.category = category;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setIdShort(String idShort) {
    this.idShort = idShort;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setDisplayName(
      List<ILangStringNameType> displayName) {
    this.displayName = displayName;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setDescription(
      List<ILangStringTextType> description) {
    this.description = description;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setSupplementalSemanticIds(
      List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setQualifiers(List<IQualifier> qualifiers) {
    this.qualifiers = qualifiers;
    return this;
  }

  public MultiLanguagePropertyMetadataBuilder setEmbeddedDataSpecifications(
      List<IEmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    return this;
  }

  public MultiLanguagePropertyMetadata build() {
    return new MultiLanguagePropertyMetadata(
        this.extensions,
        this.category,
        this.idShort,
        this.displayName,
        this.description,
        this.semanticId,
        this.supplementalSemanticIds,
        this.qualifiers,
        this.embeddedDataSpecifications);
  }
}
