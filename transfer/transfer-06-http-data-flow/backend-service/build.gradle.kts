/*
 *  Copyright (c) 2022 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

plugins {
    id("java")
}

val edcGroupId = "org.eclipse.edc"
val edcVersion = "0.0.1-milestone-7"

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "org.eclipse.edc.EdcHttpServer"
    }
}