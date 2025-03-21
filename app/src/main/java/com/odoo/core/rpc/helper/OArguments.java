/**
 * Odoo, Open Source Management Solution Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * <p>This program is free software: you can redistribute it and/or modify it under the terms of the
 * GNU Affero General Public License as published by the Free Software Foundation, either version 3
 * of the License, or (at your option) any later version
 *
 * <p>This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details
 *
 * <p>You should have received a copy of the GNU Affero General Public License along with this
 * program. If not, see <http:www.gnu.org/licenses/>
 *
 * <p>Created on 21/4/15 4:05 PM
 */
package com.odoo.core.rpc.helper;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class OArguments extends ODomainArgsHelper<OArguments> {
    public static final String TAG = OArguments.class.getSimpleName();

    public OArguments add(List<Object> datas) {
        try {
            add(new JSONArray(datas.toString()));
        } catch (JSONException e) {
        }
        return this;
    }

    public OArguments addNULL() {
        mObjects.add(null);
        return this;
    }

    public JSONArray get() {
        JSONArray arguments = new JSONArray();
        for (Object obj : getObject()) {
            JSONArray data = new JSONArray();
            data.put(obj);
            if (obj instanceof JSONObject) {
                arguments.put(obj);
            } else {
                arguments.put(data);
            }
        }
        return arguments;
    }
}
