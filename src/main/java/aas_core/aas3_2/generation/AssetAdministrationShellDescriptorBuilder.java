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

/** Builder for the AssetAdministrationShellDescriptor type. */
public class AssetAdministrationShellDescriptorBuilder {
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

  /** Globally unique identification of the Asset Administration Shell. */
  private String id;

  /** Administrative information of the Asset Administration Shell. */
  private IAdministrativeInformation administration;

  /**
   * Denotes whether the asset of the described Asset Administration Shell is of kind {@link
   * aas_core.aas3_2.types.enums.AssetKind#TYPE}, {@link
   * aas_core.aas3_2.types.enums.AssetKind#INSTANCE}, {@link
   * aas_core.aas3_2.types.enums.AssetKind#ROLE}, or {@link
   * aas_core.aas3_2.types.enums.AssetKind#NOT_APPLICABLE}.
   */
  private AssetKind assetKind;

  /**
   * The type of the asset described by the Asset Administration Shell of this descriptor.
   *
   * <p>See {@link aas_core.aas3_2.types.impl.AssetInformation#getAssetType()} for further
   * information.
   */
  private String assetType;

  /**
   * Endpoint of the network resource.
   *
   * <p>The cardinality restriction for {@link
   * aas_core.aas3_2.types.impl.AssetAdministrationShellDescriptor#getEndpoints()} allows a provider
   * to skip the declaration of the location of an Asset Administration Shell and directly point to
   * the endpoints of the contained submodels through {@link
   * aas_core.aas3_2.types.impl.AssetAdministrationShellDescriptor#getSubmodelDescriptors()}' {@link
   * aas_core.aas3_2.types.impl.SubmodelDescriptor#getEndpoints()}. A client, therefore, might
   * decide to skip the lookup on the Asset Administration Shell. Nevertheless, in case the
   * information contained in the {@link
   * aas_core.aas3_2.types.impl.AssetAdministrationShellDescriptor} deviates from the related {@link
   * aas_core.aas3_2.types.impl.AssetAdministrationShell}, or attributes are missing, the {@link
   * aas_core.aas3_2.types.impl.AssetAdministrationShell} is always the source of truth.
   */
  private List<IEndpoint> endpoints;

  /** Global reference to the asset the Asset Administration Shell is representing. */
  private String globalAssetId;

  /** Short name of the Asset Administration Shell. */
  private String idShort;

  /** Specific asset identifier. */
  private List<ISpecificAssetId> specificAssetIds;

  /** Descriptor of a submodel of the Asset Administration Shell. */
  private List<ISubmodelDescriptor> submodelDescriptors;

  public AssetAdministrationShellDescriptorBuilder(String id) {
    this.id = Objects.requireNonNull(id, "Argument \"id\" must be non-null.");
  }

  public AssetAdministrationShellDescriptorBuilder setDescription(
      List<ILangStringTextType> description) {
    this.description = description;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setDisplayName(
      List<ILangStringNameType> displayName) {
    this.displayName = displayName;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setExtensions(List<IExtension> extensions) {
    this.extensions = extensions;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setAdministration(
      IAdministrativeInformation administration) {
    this.administration = administration;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setAssetKind(AssetKind assetKind) {
    this.assetKind = assetKind;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setAssetType(String assetType) {
    this.assetType = assetType;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setEndpoints(List<IEndpoint> endpoints) {
    this.endpoints = endpoints;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setGlobalAssetId(String globalAssetId) {
    this.globalAssetId = globalAssetId;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setIdShort(String idShort) {
    this.idShort = idShort;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setSpecificAssetIds(
      List<ISpecificAssetId> specificAssetIds) {
    this.specificAssetIds = specificAssetIds;
    return this;
  }

  public AssetAdministrationShellDescriptorBuilder setSubmodelDescriptors(
      List<ISubmodelDescriptor> submodelDescriptors) {
    this.submodelDescriptors = submodelDescriptors;
    return this;
  }

  public AssetAdministrationShellDescriptor build() {
    return new AssetAdministrationShellDescriptor(
        this.id,
        this.description,
        this.displayName,
        this.extensions,
        this.administration,
        this.assetKind,
        this.assetType,
        this.endpoints,
        this.globalAssetId,
        this.idShort,
        this.specificAssetIds,
        this.submodelDescriptors);
  }
}
