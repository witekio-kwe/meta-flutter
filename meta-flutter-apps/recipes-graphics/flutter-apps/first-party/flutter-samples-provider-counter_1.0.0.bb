#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "provider_counter"
DESCRIPTION = "The starter Flutter application, but using Provider to manage state."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "6b6104c9c99dac534ee8fe74ceb893f4da7ffc59"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "provider_counter"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-provider-counter"
FLUTTER_APPLICATION_PATH = "provider_counter"
PUBSPEC_IGNORE_LOCKFILE = "1"

inherit flutter-app

do_compile[network] = "1"

