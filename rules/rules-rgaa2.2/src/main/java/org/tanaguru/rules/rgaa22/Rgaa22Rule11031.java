/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2015  Asqatasun.org
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contact us by mail: asqatasun AT asqatasun DOT org
 */

package org.asqatasun.rules.rgaa22;

import org.asqatasun.entity.audit.TestSolution;
import org.asqatasun.ruleimplementation.AbstractMarkerPageRuleImplementation;
import org.asqatasun.rules.elementchecker.element.ElementPresenceChecker;
import org.asqatasun.rules.elementselector.SimpleElementSelector;
import static org.asqatasun.rules.keystore.CssLikeQueryStore.TABLE_WITH_TH_CSS_LIKE_QUERY;
import static org.asqatasun.rules.keystore.MarkerStore.DATA_TABLE_MARKER;
import static org.asqatasun.rules.keystore.MarkerStore.PRESENTATION_TABLE_MARKER;
import static org.asqatasun.rules.keystore.RemarkMessageStore.CHECK_DEFINITION_OF_HEADERS_FOR_DATA_TABLE_MSG;
import static org.asqatasun.rules.keystore.RemarkMessageStore.CHECK_NATURE_OF_TABLE_AND_HEADERS_DEFINITION_MSG;

/**
 * Implementation of the rule 11.3 of the referential RGAA 2.2.
 * <br/>
 * For more details about the implementation, refer to <a href="http://www.tanaguru.org/en/content/rgaa22-rule-11-3">the rule 11.3 design page.</a>
 * @see <a href="http://rgaa.net/Presence-d-une-relation-entre-les,170.html"> 11.3 rule specification </a>
 *
 * @author jkowalczyk
 */
public class Rgaa22Rule11031 extends AbstractMarkerPageRuleImplementation {

    /**
     * Default constructor
     */
    public Rgaa22Rule11031() {
        super(
                new SimpleElementSelector(TABLE_WITH_TH_CSS_LIKE_QUERY),

                // the data tables are part of the scope
                DATA_TABLE_MARKER,

                // the presentation tables are not part of the scope
                PRESENTATION_TABLE_MARKER,

                // checker for elements identified by marker
                new ElementPresenceChecker(
                    // nmi when element is found
                    TestSolution.NEED_MORE_INFO, 
                    // na when element is not found
                    TestSolution.NOT_APPLICABLE, 
                    CHECK_DEFINITION_OF_HEADERS_FOR_DATA_TABLE_MSG,
                    null), 
                
                // checker for elements not identified by marker
                new ElementPresenceChecker(
                    // nmi when element is found
                    TestSolution.NEED_MORE_INFO, 
                    // na when element is not found
                    TestSolution.NOT_APPLICABLE, 
                    CHECK_NATURE_OF_TABLE_AND_HEADERS_DEFINITION_MSG,
                    null)
            );
    }

}