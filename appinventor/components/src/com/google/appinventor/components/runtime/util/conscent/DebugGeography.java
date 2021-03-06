package com.google.appinventor.components.runtime.util.conscent;

/*
 * Copyright 2018 Google LLC
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

/** Debug values for testing geography. */
public enum DebugGeography {
    DEBUG_GEOGRAPHY_DISABLED(0),
    DEBUG_GEOGRAPHY_EEA(1),
    DEBUG_GEOGRAPHY_NOT_EEA(2);

    private final int value;

    DebugGeography(int value) {
        this.value = value;
    }

    public Integer getCode() {
        return value;
    }
}
