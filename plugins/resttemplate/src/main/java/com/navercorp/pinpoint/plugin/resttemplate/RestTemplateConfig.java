/*
 * Copyright 2017 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.navercorp.pinpoint.plugin.resttemplate;

import com.navercorp.pinpoint.bootstrap.config.ProfilerConfig;

/**
 * @author Taejin Koo
 */
public class RestTemplateConfig {

    static final String PLUGIN_ENABLE = "profiler.resttemplate";

    private final boolean pluginEnable;

    public RestTemplateConfig(ProfilerConfig config) {
        pluginEnable = config.readBoolean(PLUGIN_ENABLE, false);
    }

    public boolean isPluginEnable() {
        return pluginEnable;
    }

}
