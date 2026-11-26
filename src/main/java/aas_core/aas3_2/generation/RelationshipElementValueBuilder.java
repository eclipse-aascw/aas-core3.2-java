// SPDX-FileCopyrightText: 2025 aas-core3.2-java AUTHORS
//
// SPDX-License-Identifier: MIT

package aas_core.aas3_2.generation;

import aas_core.aas3_2.common.*;
import aas_core.aas3_2.types.enums.*;
import aas_core.aas3_2.types.impl.*;
import aas_core.aas3_2.types.model.*;

/** Builder for the RelationshipElementValue type. */
public class RelationshipElementValueBuilder {
  /** Reference to the first element in the relationship. */
  private IReference first;

  /** Reference to the second element in the relationship. */
  private IReference second;

  public RelationshipElementValueBuilder setFirst(IReference first) {
    this.first = first;
    return this;
  }

  public RelationshipElementValueBuilder setSecond(IReference second) {
    this.second = second;
    return this;
  }

  public RelationshipElementValue build() {
    return new RelationshipElementValue(this.first, this.second);
  }
}
