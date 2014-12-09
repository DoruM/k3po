/*
 * Copyright (c) 2014 "Kaazing Corporation," (www.kaazing.com)
 *
 * This file is part of Robot.
 *
 * Robot is free software: you can redistribute it and/or modify
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
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.kaazing.robot.lang.ast;

import org.kaazing.robot.lang.RegionInfo;

public class AstRegionException extends Exception {

    private static final long serialVersionUID = 1L;

    private RegionInfo regionInfo;

    public AstRegionException() {
        super();
    }

    public AstRegionException(String message, Throwable cause) {
        super(message, cause);
    }

    public AstRegionException(String message) {
        super(message);
    }

    public AstRegionException(Throwable cause) {
        super(cause);
    }

    public RegionInfo getLocationInfo() {
        return regionInfo;
    }

    public AstRegionException initRegionInfo(RegionInfo regionInfo) {
        this.regionInfo = regionInfo;
        return this;
    }

}