#!/bin/sh
# ====================================================================
# Copyright (c) 2013, 2015 Obeo
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License v1.0
# which accompanies this distribution, and is available at
# http://www.eclipse.org/legal/epl-v10.html
#
# Contributors:
#    Obeo - initial API and implementation
# ====================================================================

[ -z "$WORKSPACE"  -o -z "$PLATFORM" -o -z "$GIT_BRANCH" ] && {
     echo "Execution aborted.

One or more of the required variables is not set. They are normally
provided by the Hudson build.

- WORKSPACE  : the build workspace root.
- PLATFORM   : the name of the target Eclipse release (e.g. kepler).
- GIT_BRANCH : the name fo the Git branch being build/published.
"
    exit 1
}

######################################################################
# Setup
######################################################################

# Exit on error
set -e

# The full version (should be taken as an argument)
export VERSION="2.0.0"

# The type of build being published
export BUILD_TYPE="nightly"
export BUILD_TYPE_PREFIX="N"

# The root folder for all EEF update sites
export EEF_UPDATES_ROOT="/home/data/httpd/download.eclipse.org/modeling/emft/eef/updates"

# Converts the Hudson BUILD_ID (e.g. 2013-10-15_07-07-07) into the
# syntax we want for our update-sites (e.g. 20131015-070707)
export BUILD_TIMESTAMP=$(echo "$BUILD_ID" | sed -e 's/-//g' -e 's/_/-/')

# The full version for this build, e.g. 0.9.0-N20131015-070707
export FULL_VERSION="${VERSION}-${BUILD_TYPE_PREFIX}${BUILD_TIMESTAMP}"

# The root folder where all the builds of the same type as this one
# are published
export TARGET_ROOT="$EEF_UPDATES_ROOT/$BUILD_TYPE"

# The folder for this particular build
export TARGET_DIR="$TARGET_ROOT/$FULL_VERSION/$PLATFORM"

######################################################################
# Publish the build
######################################################################
export WKS="."

# Ensure the target folder exists
mkdir -p "$TARGET_DIR"
# The actual publication of the p2 repo produced by the build
cp -a "$WKS"/packaging/org.eclipse.sirius.update/target/repository/* "$TARGET_DIR"
# Publish the target platform definitions used, so that downstream projects can reference them
mkdir -p "$TARGET_DIR/targets"
cp -a "$WKS"/releng/org.eclipse.eef.releng/targetplatforms/* "$TARGET_DIR/targets"
mkdir -p "$TARGET_ROOT/targets"
cp -a "$WKS"/releng/org.eclipse.eef.releng/targetplatforms/* "$TARGET_ROOT/targets"
# Publish a dump of the build environment, may be useful to debug
env | sort > "$TARGET_DIR/build_env.txt"

 