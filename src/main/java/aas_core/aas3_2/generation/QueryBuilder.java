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

/** Builder for the Query type. */
public class QueryBuilder {
  /**
   * What the query returns instead of the full objects.
   *
   * <p>If not specified, the full objects are returned.
   */
  private QuerySelect select;

  /** The condition which the returned objects need to fulfill */
  private LogicalExpression condition;

  /**
   * Filters to reduce the returned data
   *
   * <p>The list can be empty, as the grammar allows {@code $filters} to be followed by zero
   * filters. Elements without a filter remain unfiltered.
   */
  private List<IQueryFilter> filters;

  public QueryBuilder(LogicalExpression condition) {
    this.condition = Objects.requireNonNull(condition, "Argument \"condition\" must be non-null.");
  }

  public QueryBuilder setSelect(QuerySelect select) {
    this.select = select;
    return this;
  }

  public QueryBuilder setFilters(List<IQueryFilter> filters) {
    this.filters = filters;
    return this;
  }

  public Query build() {
    return new Query(this.condition, this.select, this.filters);
  }
}
