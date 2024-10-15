/*
* Copyright (c) 2023 Contributors to the Eclipse Foundation.
*
* This program and the accompanying materials are made
* available under the terms of the Eclipse Public License 2.0
* which is available at https://www.eclipse.org/legal/epl-2.0/
*
* SPDX-License-Identifier: EPL-2.0
*
* Contributors:
*   SmartCity Jena - initial
*   Stefan Bischof (bipolis.org) - initial
*/
package org.eclipse.daanse.mdx.model.record.select;

import java.util.List;

import org.eclipse.daanse.mdx.model.api.expression.CompoundId;
import org.eclipse.daanse.mdx.model.api.expression.MdxExpression;
import org.eclipse.daanse.mdx.model.api.select.CreateMemberBodyClause;
import org.eclipse.daanse.mdx.model.api.select.MemberPropertyDefinition;

public record CreateMemberBodyClauseR(CompoundId compoundId, MdxExpression expression,
        List<MemberPropertyDefinition> memberPropertyDefinitions) implements CreateMemberBodyClause {

}
