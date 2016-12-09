package org.openbmap.utils;

import org.mapsforge.core.model.LatLong;

/*
	Radiobeacon - Openbmap wifi and cell logger
    Copyright (C) 2013  wish7

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
public class CatalogObject {
    public long id;
    public LatLong latLong;

    public String data;
    public String category;

    public CatalogObject(long id, double lat, double lon, String data, String category) {
        this.id = id;
        this.latLong = new LatLong(lat,lon);
        this.data = data;
        this.category = category;
    }
}