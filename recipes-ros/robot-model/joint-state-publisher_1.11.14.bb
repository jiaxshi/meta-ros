DESCRIPTION = "This package contains a tool for setting and publishing \
joint state values for a given URDF."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy wxpython sensor-msgs"

require robot-model.inc

RDEPENDS_${PN} = "wxpython"

inherit distro_features_check

# Depends on wxpython which depends on wxwidgets which depends on libxinerama, libglu, gtk need x11 in DISTRO_FEATURES
REQUIRED_DISTRO_FEATURES = "x11"

PNBLACKLIST[joint-state-publisher] ?= "Depends on wxpython which depends on wxwidgets which depends on old gstreamer 0.10 recipes removed from meta-oe in 2.7 Warrior"
