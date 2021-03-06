/*
 * Copyright 2018 a.musumeci.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.nimble.dcfs.producer.json;

/**
 *
 * @author a.musumeci
 */


import com.github.wnameless.json.flattener.JsonFlattener;
import com.github.wnameless.json.unflattener.JsonUnflattener;

public class FlatternManager {
    
    
    public static String getFlatten(String json) {
             return new JsonFlattener(json).withSeparator('_').flatten();
    }

    public static String getUnFlatten(String flatJson) {
             return JsonUnflattener.unflatten(flatJson);
    }
    
    
}
