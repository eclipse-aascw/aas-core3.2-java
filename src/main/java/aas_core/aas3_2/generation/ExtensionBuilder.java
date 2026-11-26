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

/** Builder for the Extension type. */
public class ExtensionBuilder {
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
   * Name of the extension.
   *
   * <p>Constraints:
   *
   * <ul>
   *   <li>Constraint AASd-077: The name of an extension (Extension/name) within {@link
   *       aas_core.aas3_2.types.model.IHasExtensions} needs to be unique.
   * </ul>
   */
  private String name;

  /**
   * Data type of the {@link aas_core.aas3_2.types.impl.Extension#getValue()} attribute of the
   * extension.
   *
   * <p>Default: {@link aas_core.aas3_2.types.enums.DataTypeDefXsd#STRING}
   */
  private DataTypeDefXsd valueType;

  /** Value of the extension */
  private String value;

  /** Reference to an element the extension refers to. */
  private List<IReference> refersTo;

  public ExtensionBuilder(String name) {
    this.name = Objects.requireNonNull(name, "Argument \"name\" must be non-null.");
  }

  public ExtensionBuilder setSemanticId(IReference semanticId) {
    this.semanticId = semanticId;
    return this;
  }

  public ExtensionBuilder setSupplementalSemanticIds(List<IReference> supplementalSemanticIds) {
    this.supplementalSemanticIds = supplementalSemanticIds;
    return this;
  }

  public ExtensionBuilder setValueType(DataTypeDefXsd valueType) {
    this.valueType = valueType;
    return this;
  }

  public ExtensionBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ExtensionBuilder setRefersTo(List<IReference> refersTo) {
    this.refersTo = refersTo;
    return this;
  }

  public Extension build() {
    return new Extension(
        this.name,
        this.semanticId,
        this.supplementalSemanticIds,
        this.valueType,
        this.value,
        this.refersTo);
  }
}
