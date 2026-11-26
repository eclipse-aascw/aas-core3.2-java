// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;
import java.util.List;

/** Builder for the AdministrativeInformation type. */
public class AdministrativeInformationBuilder {
  /** Embedded data specification. */
  private List<IEmbeddedDataSpecification> embeddedDataSpecifications;

  /** Version of the element. */
  private String version;

  /** Revision of the element. */
  private String revision;

  /** The subject ID of the subject responsible for making the element. */
  private IReference creator;

  /** date of creation. */
  private String createdAt;

  /** date of update. */
  private String updatedAt;

  /**
   * Identifier of the template that guided the creation of the element.
   *
   * <p>So far, {@link aas_core.aas3_2.types.impl.AdministrativeInformation#getTemplateId()} is only
   * applicable for {@link aas_core.aas3_2.types.impl.Submodel}'s, since template specifications are
   * standardized for Submodels only.
   *
   * <p>In case of a submodel, the {@link
   * aas_core.aas3_2.types.impl.AdministrativeInformation#getTemplateId()} is the identifier of the
   * submodel template that guided the creation of the submodel
   *
   * <p>The {@link aas_core.aas3_2.types.impl.AdministrativeInformation#getTemplateId()} is not
   * relevant for validation in Submodels. For validation the {@link
   * aas_core.aas3_2.types.impl.Submodel#getSemanticId()} shall be used.
   *
   * <p>Usage of {@link aas_core.aas3_2.types.impl.AdministrativeInformation#getTemplateId()} is not
   * restricted to submodel instances. So also the creation of submodel templates can be guided by
   * another submodel template.
   */
  private String templateId;

  public AdministrativeInformationBuilder setEmbeddedDataSpecifications(
      List<IEmbeddedDataSpecification> embeddedDataSpecifications) {
    this.embeddedDataSpecifications = embeddedDataSpecifications;
    return this;
  }

  public AdministrativeInformationBuilder setVersion(String version) {
    this.version = version;
    return this;
  }

  public AdministrativeInformationBuilder setRevision(String revision) {
    this.revision = revision;
    return this;
  }

  public AdministrativeInformationBuilder setCreator(IReference creator) {
    this.creator = creator;
    return this;
  }

  public AdministrativeInformationBuilder setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  public AdministrativeInformationBuilder setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  public AdministrativeInformationBuilder setTemplateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

  public AdministrativeInformation build() {
    return new AdministrativeInformation(
        this.embeddedDataSpecifications,
        this.version,
        this.revision,
        this.creator,
        this.createdAt,
        this.updatedAt,
        this.templateId);
  }
}
