#
# Copyright (c) 2020-2024 Joel Winarske. All rights reserved.
#

SUMMARY = "banner_example"
DESCRIPTION = "Example project for demoing banner ads."
AUTHOR = "Goolge Ads"
HOMEPAGE = "None"
BUGTRACKER = "None"
SECTION = "graphics"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRCREV = "51d1465196c916e5814b2fca7ad7596645a37695"
SRC_URI = "git://github.com/googleads/googleads-mobile-flutter.git;lfs=0;branch=main;protocol=https;destsuffix=git"

S = "${WORKDIR}/git"

PUBSPEC_APPNAME = "banner_example"
FLUTTER_APPLICATION_INSTALL_SUFFIX = "googleads-flutter-samples-admob-banner-example"
FLUTTER_APPLICATION_PATH = "samples/admob/banner_example"

inherit flutter-app
