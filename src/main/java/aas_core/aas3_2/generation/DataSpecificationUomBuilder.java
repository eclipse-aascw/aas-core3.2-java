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

/** Builder for the DataSpecificationUom type. */
public class DataSpecificationUomBuilder {
  /** Preferred name of the unit in different languages as defined by the classification system. */
  private List<ILangStringUom> preferredName;

  /** Symbol of the unit. */
  private String symbol;

  /**
   * ID of the unit defined by the classification system.
   *
   * <p>This is relevant if the classification system references the unit differently from the
   * concept description ID.
   */
  private String specificUnitId;

  /** Definition of the unit in different languages. */
  private List<IDefinitionTypeUom> definition;

  /**
   * Preferred name of the unit's quantity in different languages as defined by the classification
   * system.
   *
   * <p>{@link aas_core.aas3_2.types.impl.DataSpecificationUom#getPreferredNameQuantity()} and
   * {@link aas_core.aas3_2.types.impl.DataSpecificationUom#getQuantityId()} must be consistent if
   * both attributes are set.
   *
   * <p>If the classification system lists multiple quantities for the unit, exactly one of those
   * quantities must be selected in accordance with the properties purpose.
   */
  private List<ILangStringUom> preferredNameQuantity;

  /**
   * ID of the unit's quantity.
   *
   * <p>{@link aas_core.aas3_2.types.impl.DataSpecificationUom#getPreferredNameQuantity()} and
   * {@link aas_core.aas3_2.types.impl.DataSpecificationUom#getQuantityId()} must be consistent if
   * both attributes are set.
   */
  private String quantityId;

  /**
   * Name of the classification system used for the definition of units and quantities.
   *
   * <p>The most prominent classification systems should be denoted as follows: "ECLASS", "IEC CDD",
   * "UNECE Rec 20", "UNECE Rec 21", "BIPM", "OPC UA", "SAMM".
   *
   * <p>This list is not exclusive.
   */
  private String classificationSystem;

  /**
   * Version of the classification system used for the definition of units and quantities.
   *
   * <p>The version shshould be denoted exactly as provided by the classification system.
   */
  private String classificationSystemVersion;

  public DataSpecificationUomBuilder(List<ILangStringUom> preferredName, String symbol) {
    this.preferredName =
        Objects.requireNonNull(preferredName, "Argument \"preferredName\" must be non-null.");
    this.symbol = Objects.requireNonNull(symbol, "Argument \"symbol\" must be non-null.");
  }

  public DataSpecificationUomBuilder setSpecificUnitId(String specificUnitId) {
    this.specificUnitId = specificUnitId;
    return this;
  }

  public DataSpecificationUomBuilder setDefinition(List<IDefinitionTypeUom> definition) {
    this.definition = definition;
    return this;
  }

  public DataSpecificationUomBuilder setPreferredNameQuantity(
      List<ILangStringUom> preferredNameQuantity) {
    this.preferredNameQuantity = preferredNameQuantity;
    return this;
  }

  public DataSpecificationUomBuilder setQuantityId(String quantityId) {
    this.quantityId = quantityId;
    return this;
  }

  public DataSpecificationUomBuilder setClassificationSystem(String classificationSystem) {
    this.classificationSystem = classificationSystem;
    return this;
  }

  public DataSpecificationUomBuilder setClassificationSystemVersion(
      String classificationSystemVersion) {
    this.classificationSystemVersion = classificationSystemVersion;
    return this;
  }

  public DataSpecificationUom build() {
    return new DataSpecificationUom(
        this.preferredName,
        this.symbol,
        this.specificUnitId,
        this.definition,
        this.preferredNameQuantity,
        this.quantityId,
        this.classificationSystem,
        this.classificationSystemVersion);
  }
}
