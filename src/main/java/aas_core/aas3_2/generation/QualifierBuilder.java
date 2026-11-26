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

/** Builder for the Qualifier type. */
public class QualifierBuilder {
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
   * The qualifier kind describes the kind of qualifier that is applied to the element.
   *
   * <p>Default: {@link aas_core.aas3_2.types.enums.QualifierKind#CONCEPT_QUALIFIER}
   */
  private QualifierKind kind;

  /** The qualifier <em>type</em> describes the type of qualifier that is applied to the element. */
  private String type;

  /** Data type of the qualifier value. */
  private DataTypeDefXsd valueType;

  /** The qualifier value is the value of the qualifier. */
  private String value;

  /** Reference to the global unique ID of a coded value. */
  private IReference valueId;

  public QualifierBuilder(String type, DataTypeDefXsd valueType) {
    this.type = Objects.requireNonNull(type, "Argument \"type\" must be non-null.");
    this.valueType = Objects.requireNonNull(valueType, "Argument \"valueType\" must be non-null.");
  }

  public QualifierBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public QualifierBuilder setSupplementalSemanticIds(List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public QualifierBuilder setKind(QualifierKind kind) {
    this.kind = kind;
    return this;
  }

  public QualifierBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public QualifierBuilder setValueId(IReference valueId) {
    this.valueId = valueId;
    return this;
  }

  public Qualifier build() {
    return new Qualifier(
        this.type,
        this.valueType,
        this.semanticId,
        this.supplementalSemanticIds,
        this.kind,
        this.value,
        this.valueId);
  }
}
