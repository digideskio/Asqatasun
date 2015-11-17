/*
 * Asqatasun - Automated webpage assessment
 * Copyright (C) 2008-2015  Asqatasun.org
 *
 * This file is part of Asqatasun.
 *
 * Asqatasun is free software: you can redistribute it and/or modify
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
package org.asqatasun.webapp.entity.factory.option;

import org.asqatasun.sdk.entity.factory.GenericFactory;
import org.asqatasun.webapp.entity.option.Option;
import org.asqatasun.webapp.entity.option.OptionFamily;

/**
 *
 * @author jkowalczyk
 */
public interface OptionFactory extends GenericFactory<Option> {

    /**
     * 
     * @param optionFamily
     * @param code
     * @param label
     * @param description
     * @param isRestriction
     * @return 
     *      an initialised instance of option
     */        
    Option createOption(
            OptionFamily optionFamily, 
            String code, 
            String label, 
            String description, 
            boolean isRestriction);

}
