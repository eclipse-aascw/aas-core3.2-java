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

/** Builder for the PackageDescription type. */
public class PackageDescriptionBuilder {
  /** File server specific package id */
  private String packageId;

  /** Asset Administration Shell unique identifiers */
  private List<String> aasIds;

  public PackageDescriptionBuilder(String packageId) {
    this.packageId = Objects.requireNonNull(packageId, "Argument \"packageId\" must be non-null.");
  }

  public PackageDescriptionBuilder setAasIds(List<String> aasIds) {
    this.aasIds = aasIds;
    return this;
  }

  public PackageDescription build() {
    return new PackageDescription(this.packageId, this.aasIds);
  }
}
