/*
 * Copyright 2012-2017 the original author or authors.
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

package org.springframework.boot.actuate.autoconfigure.trace;

import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.actuate.trace.Include;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Configuration properties for tracing.
 *
 * @author Wallace Wadge
 * @author Phillip Webb
 * @author Venil Noronha
 * @author Madhura Bhave
 * @author Stephane Nicoll
 * @author Jorgen Ringen
 * @since 1.3.0
 */
@ConfigurationProperties(prefix = "management.trace")
public class TraceEndpointProperties {

	/**
	 * Items to be included in the trace. Defaults to request/response headers (including
	 * cookies) and errors.
	 */
	private Set<Include> include = new HashSet<>(Include.defaultIncludes());

	/**
	 * Paths that should not be traced.
	 */
	private Set<String> ignoredPaths = new HashSet<>();

	public Set<Include> getInclude() {
		return this.include;
	}

	public void setInclude(Set<Include> include) {
		this.include = include;
	}

	public Set<String> getIgnoredPaths() {
		return this.ignoredPaths;
	}

	public void setIgnoredPaths(Set<String> ignoredPaths) {
		this.ignoredPaths = ignoredPaths;
	}
}
