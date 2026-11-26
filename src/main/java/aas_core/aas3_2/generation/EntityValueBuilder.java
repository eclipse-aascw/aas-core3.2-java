// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.List;

/** Builder for the EntityValue type. */
public class EntityValueBuilder {
  /** Describes whether the entity is a co-managed entity or a self-managed entity. */
  private EntityType entityType;

  /** Global identifier of the asset the entity is representing. */
  private String globalAssetId;

  /**
   * Additional domain-specific, typically proprietary identifiers for the asset, each given as a
   * single-entry JSON object mapping the {@link
   * aas_core.aas3_2.types.impl.SpecificAssetId#getName()} to the {@link
   * aas_core.aas3_2.types.impl.SpecificAssetId#getValue()}.
   */
  private List<ObjectNode> specificAssetIds;

  /**
   * Describes statements applicable to the entity by a set of submodel elements, typically with a
   * qualified value.
   */
  private ObjectNode statements;

  public EntityValueBuilder setEntityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

  public EntityValueBuilder setGlobalAssetId(String globalAssetId) {
    this.globalAssetId = globalAssetId;
    return this;
  }

  public EntityValueBuilder setSpecificAssetIds(List<ObjectNode> specificAssetIds) {
    this.specificAssetIds = specificAssetIds;
    return this;
  }

  public EntityValueBuilder setStatements(ObjectNode statements) {
    this.statements = statements;
    return this;
  }

  public EntityValue build() {
    return new EntityValue(
        this.entityType, this.globalAssetId, this.specificAssetIds, this.statements);
  }
}
