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

/** Builder for the AssetAdministrationShellRecentChange type. */
public class AssetAdministrationShellRecentChangeBuilder {
  /** The point in time at which the Identifiable object was created */
  private String createdAt;

  /** The point in time at which the Identifiable object was recently updated */
  private String updatedAt;

  /** Globally unique identification of the Asset Administration Shell */
  private String id;

  /** Global reference to the asset the AAS is representing */
  private String globalAssetId;

  /** Specific asset identifier */
  private List<ISpecificAssetId> specificAssetIds;

  public AssetAdministrationShellRecentChangeBuilder(
      String createdAt, String updatedAt, String id) {
    this.createdAt = Objects.requireNonNull(createdAt, "Argument \"createdAt\" must be non-null.");
    this.updatedAt = Objects.requireNonNull(updatedAt, "Argument \"updatedAt\" must be non-null.");
    this.id = Objects.requireNonNull(id, "Argument \"id\" must be non-null.");
  }

  public AssetAdministrationShellRecentChangeBuilder setGlobalAssetId(String globalAssetId) {
    this.globalAssetId = globalAssetId;
    return this;
  }

  public AssetAdministrationShellRecentChangeBuilder setSpecificAssetIds(
      List<ISpecificAssetId> specificAssetIds) {
    this.specificAssetIds = specificAssetIds;
    return this;
  }

  public AssetAdministrationShellRecentChange build() {
    return new AssetAdministrationShellRecentChange(
        this.createdAt, this.updatedAt, this.id, this.globalAssetId, this.specificAssetIds);
  }
}
