#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "platform_view_swift"
DESCRIPTION = "A new Flutter project."
AUTHOR = "Google"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b7eeb61b41ae366e94383bca5e113fce"

SRCREV = "c7a69412f123afd9ac92a96075b4a4e5569bc7b0"
SRC_URI = "git://github.com/flutter/samples.git;lfs=1;nobranch=1;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "platform_view_swift"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "flutter-samples-platform-view-swift"
FLUTTER_APPLICATION_PATH = "platform_view_swift"

inherit flutter-app
