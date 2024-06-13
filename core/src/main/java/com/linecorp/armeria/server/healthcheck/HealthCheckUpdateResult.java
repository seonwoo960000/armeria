/*
 * Copyright 2019 LINE Corporation
 *
 * LINE Corporation licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.linecorp.armeria.server.healthcheck;

import com.linecorp.armeria.server.Server;

/**
 * The result of a request handled by {@link HealthCheckUpdateHandler}.
 */
public enum HealthCheckUpdateResult {
    /**
     * Tells {@link HealthCheckService} to mark the {@link Server} as 'healthy'.
     */
    HEALTHY,
    /**
     * Tells {@link HealthCheckService} to mark the {@link Server} as 'degraded'.
     */
    DEGRADED,
    /**
     * Tells {@link HealthCheckService} to mark the {@link Server} as 'stopping'.
     */
    STOPPING,
    /**
     * Tells {@link HealthCheckService} to mark the {@link Server} as 'unhealthy'.
     */
    UNHEALTHY,
    /**
     * Tells {@link HealthCheckService} to mark the {@link Server} as 'under maintenance'.
     */
    UNDER_MAINTENANCE,
    /**
     * Tells {@link HealthCheckService} to leave the {@link Server} healthiness unchanged.
     */
    AS_IS
}
