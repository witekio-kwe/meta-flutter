#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "hello"
DESCRIPTION = "Hello World example for RFW"
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a60894397335535eb10b54e2fff9f265"

SRCREV = "66e98d826961304b893ac56e8da5f927be08c78b"
SRC_URI = "git://github.com/flutter/packages.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "hello"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-packages-rfw-example-hello"
FLUTTER_APPLICATION_PATH = "packages/rfw/example/hello"

inherit flutter-app
